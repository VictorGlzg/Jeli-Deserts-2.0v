-- drop database Pasteleria;
create database Pasteleria;
use Pasteleria;

create table Cliente
(
	id_client int auto_increment primary key,
    nom_client varchar(50),
    correo varchar(50),
    dir_client varchar(100),
    tel_client varchar(10),
    cumpleA date,
    unique (tel_client)
)auto_increment=500;

create table Productos
(
	id int auto_increment primary key,
    tipo varchar(20),
    costo double,
    sabor varchar(20)
)auto_increment=99;

create table Pedido
(
	id int auto_increment primary key,
    fecha date,
    id_client int,
    foreign key (id_client) references Cliente(id_client) on delete cascade
)auto_increment=1500;

create table Detalle_Ped_Prod
(
	id_detpp int auto_increment primary key,
	ped_id int,
    prod_id int,
    adit varchar(100),
    cantidad int,
    foreign key (ped_id) references Pedido(id) on delete cascade,
    foreign key (prod_id) references Productos(id) on delete cascade
)auto_increment=200;

insert into Cliente (nom_client,correo,dir_client,tel_client,cumpleA) values
("Rufo Patino","RufoPatino@jourrapide.com","Cruce Casa de Postas, 981 Fuente Vaqueros",6391122583,"1987/03/7"),
("Martiniano Bustos","MartinianoBustos@teleworm.us","Pl. Virgen Blanca, 960 Vic",6517952993,"1970/01/02"),
("Mijal Muñoz","MijalMunoz@jourrapide.com","C/ Fernández de Leceta, 560 la Nucia",6280332933,"1989/04/22"),
("Kipa Madrigal","KipaMadrigal@armyspy.com","Enxertos, 913 Robleda",7678323402,"1990/03/27"),
("Orazio Galvez","OrazioGalvez@jourrapide.com","Herrería, 621 Pinos Puente",6635114334,"1978/10/03"),
("Melissa Abeyta","MelissaAbeyta@teleworm.us","C/ Benito Guinea, 760 Pineda de Mar",7706202605,"1976/11/27"),
("Iracema Linares","IracemaLinares@dayrep.com","Calle Carril de la Fuente, 361 Caracuel de Calatrava",6184821796,"1989/05/30"),
("Vernón Blanco","VernonBlanco@jourrapide.com","Comandante Izarduy, 200 Sitges",6883423779,"2001/04/20"),
("Dimitri Arroyo","DimitriArroyo@jourrapide.com","Rosa de los Vientos, 421 Alcubillas",6425542182,"1970/03/25"),
("Elpidio Tirado","ElpidioTirado@jourrapide.com","C/ Eras, 47 Gascones",6559259993,"2000/03/12");

-- select * from Cliente;

insert into Productos(tipo,costo,sabor)values
("Promo especial",0,""),
("Pastel",150.50,"Chocolate"),
("Galletas",40.50,"Vainilla"),
("Cupcake",10,"Vainilla"),
("Brownie",15,"Chocolate"),
("Pay",50,"Queso"),
("Budin",140,"Naranja"),
("Pastel Helado",240.50,"Napolitano"),
("Carlota",100,"Limón"),
("Bizcocho",80.40,"Manzana"),
("Flan",20.50,"Queso");

insert into Pedido (fecha,id_client) values
("2022/03/27",501),
("2022/04/06",503),
("2022/07/15",505),
("2022/08/10",501),
("2022/04/20",507),
("2022/05/10",504),
("2022/07/24",502),
("2022/10/10",504),
("2022/11/03",506),
("2022/06/11",500);

insert into Detalle_Ped_Prod (ped_id,prod_id,adit,cantidad) values
(1500,100,"Extra fresa",3),
(1501,101,"",5),
(1502,103,"",10),
(1503,100,"Extra chocolate",3),
(1504,107,"",5),
(1505,104,"",10),
(1502,101,"",5),
(1505,108,"",10),
(1506,109,"",5),
(1507,104,"",10),
(1502,105,"",5);

-- Procedimientos:

-- Alta de los Clientes
delimiter //
create function Alta_Cliente (nombre varchar(50),correo varchar(50),dir_client varchar(100),tel_client varchar(12),cumple date) returns varchar(50) 
READS SQL DATA 
DETERMINISTIC 
begin 
declare mensaje varchar (50);
	insert into Cliente (nom_client,correo,dir_client,tel_client,cumpleA) values (nombre,correo,dir_client,tel_client,cumple); 
	set mensaje = 'Alta exitosa';
return mensaje; 
end// delimiter ; 

-- select Alta_Cliente("Rufo Patino","RufoPatino@jourrapide.com","Cruce Casa de Postas, 981 Fuente Vaqueros",639112258);
-- drop function Alta_Cliente;

-- Baja de los Clientes
delimiter //
create function Baja_Cliente(id int) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
begin
declare message varchar (50);
	if exists((select id_client from Cliente where id_client like id)) then
		delete from Cliente where id_client like id;
        set message = 'Cliente borrado exitosamente';
    else
		set message = 'No se realizó el borrado';
    end if;    

return message;
end // delimiter ;

-- select Baja_Cliente('Rufo Patino');
-- drop function Baja_Cliente;

delimiter //
create function Buscar_Cliente(nombre varchar(50)) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
begin
	declare message varchar(50);
    declare id_c int;
    if (exists(select nom_client from Cliente where nom_client like nombre)) then
		select id_client into id_c from Cliente where nom_client like nombre; -- IMPORTANTE
        set message = concat('El Id del cliente: ',nombre,' es: ',id_c);
	else
		set message='Error, cliente no encontrado';
    end if;
    return message;
end// delimiter ;

-- select Buscar_Cliente("Rufo Patino");
-- drop function Buscar_Cliente;

DELIMITER // 
CREATE PROCEDURE Mostrar_Clientes()  
BEGIN 
SELECT * FROM Cliente ; 
END // DELIMITER ; 

-- call Mostrar_Clientes();

DELIMITER // 
CREATE PROCEDURE Mostrar_Cliente(nombre varchar(50))
BEGIN
declare message varchar(50);
if (exists(select nom_client from Cliente where nom_client like nombre)) then
	select * from Cliente where nom_client = nombre; -- IMPORTANTE
else
	set message = 'Cliente no encontrado';
end if;
END // DELIMITER ; 
-- call mostrar_clientes('Rufo Babas');

DELIMITER // 
CREATE PROCEDURE Mostrar_ClienteID(id int)
BEGIN
declare message varchar(50);
if (exists(select id_client from Cliente where id_client like id)) then
	select * from Cliente where id_client = id; -- IMPORTANTE
else
	set message = 'Cliente no encontrado';
end if;
END // DELIMITER ; 

DELIMITER // 
CREATE PROCEDURE Mostrar_ClienteTel(noTel varchar(10))
BEGIN
declare message varchar(50);
if (exists(select id_client from Cliente where tel_client like noTel)) then
	select * from Cliente where tel_client = noTel; -- IMPORTANTE
else
	set message = 'Cliente no encontrado';
end if;
END // DELIMITER ; 
CALL Mostrar_ClienteTel('');
CALL Mostrar_ClienteTel('7706202605');

delimiter //
create function Mod_client(id int, newname varchar(50),newcorreo varchar(50),newdir varchar(100),newtel varchar(12),newfecha date) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
	if (exists(select nom_client, correo, dir_client,tel_client,cumpleA from Cliente where id_client like id)) then
		update Cliente set nom_client = newname, correo = newcorreo, dir_client = newdir, tel_client = newtel,cumpleA = newfecha where id_client = id;
		set message = 'Modificación realizada';
	end if;
return message;	
END // delimiter ;
-- select Mod_nom_client(521,'b');
-- drop function Mod_nom_client;

-- **********************************************************************************
-- Pedidos

-- Alta de Pedidos
delimiter //
create function Alta_Pedidos (fechaped date, telclient varchar(12)) returns varchar(100) 
READS SQL DATA 
DETERMINISTIC 
begin 
declare message varchar (100);
declare idclient int;

	set idclient=(select distinct id_client from Cliente where tel_client like telclient);
    
	if exists((select id_client from Cliente where Cliente.id_client like idclient))then
		insert into Pedido (fecha, id_client) values (fechaped, idclient); 
		set message = 'Alta exitosa';
	else
		set message = 'No se realizó el alta, id de cliente o producto no encontrada';
	end if;
return message; 
end// delimiter ; 

-- drop function Alta_pedidos;
-- CALL Mostrar_Clientes();
-- CALL Mostrar_Pedidos();
-- select Alta_Pedidos('2022/06/14', '123456789');

-- Baja de pedidos
delimiter //
create function Baja_Pedidos(idpedido int) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
begin
declare message varchar (50);
	if exists((select id from Pedido where id like idpedido)) then
		delete from Pedido where id like idpedido;
        set message = 'Pedido borrado exitosamente';
    else
		set message = 'No se realizó el borrado';
    end if;    
return message;
end // delimiter ;
-- select Baja_Pedidos(1510);

DELIMITER // 
CREATE PROCEDURE Mostrar_Pedidos()  
BEGIN
	select Pedido.id, Cliente.nom_client, Cliente.cumpleA, Cliente.tel_client, Pedido.fecha 
    from Pedido join Cliente
	on Pedido.id_client=Cliente.id_client;
END // DELIMITER ; 

-- call Mostrar_Pedidos();

DELIMITER // 
CREATE PROCEDURE Mostrar_Pedido_Tel(noTel varchar(12))
BEGIN
declare message varchar(50);
if (exists(select tel_Client from Cliente where tel_Client like noTel)) then
	select Pedido.id, Cliente.nom_client, Cliente.cumpleA, Cliente.tel_client, Pedido.fecha 
    from Pedido join Cliente
	on Pedido.id_client=Cliente.id_client where Cliente.tel_client like noTel;
else
	set message = '#Telefono no encontrado';
end if;
END // DELIMITER ; 
-- drop function Mostrar_Pedido_Tel;
call Mostrar_Pedido_Tel('688342379');

DELIMITER // 
CREATE PROCEDURE Mostrar_Pedido(idpedido int)
BEGIN
declare message varchar(50);
if (exists(select id from Pedido where id like idpedido)) then
	select * from Pedido join Cliente on Pedido.id_client=Cliente.id_client where id = idpedido;
else
	set message = 'Pedido no encontrado';
end if;
END // DELIMITER ;
-- call Mostrar_Pedido('500');
-- drop procedure Mostrar_Pedido;

-- Modificaciones Pedido
delimiter //
create function Mod_ped(idped int, newfecha date, noTel varchar(12)) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
declare idclient int;

	set idclient=(select distinct id_client from Cliente where tel_client like noTel);

	if (exists(select id from Pedido where id like idped)) then
		update Pedido set fecha = newfecha, Pedido.id_client=idclient where id = idped;
		set message = 'Modificación realizada';
	end if;
return message;	
END // delimiter;
-- select Mod_adit_ped(1509, 'Sin nuez');



delimiter //
create function Mod_producto_ped (idped int, idprod int) returns varchar(100) 
READS SQL DATA 
DETERMINISTIC 
begin 
declare message varchar (100);
	if exists((select id from Productos where id like idprod)) then
		update Pedido set id_prod = idprod where id = idped; 
		set message = 'Alta exitosa';
	else
		set message = 'No se realizó el alta, id de cliente o producto no encontrada';
	end if;
return message; 
end// delimiter ; 

-- drop function Mod_producto_ped;
-- Productos

-- Alta de los Productos
delimiter //
create function Alta_Productos(tipoprod varchar(20), costoprod double, saborprod varchar(20)) returns varchar(50) 
READS SQL DATA 
DETERMINISTIC 
begin 
declare message varchar (50);
		insert into Productos (tipo,costo,sabor) values (tipoprod,costoprod,saborprod); 
		set message = 'Alta exitosa';
return message; 
end// delimiter ;
-- drop function Alta_Productos;
-- select Alta_Productos('Pastelxd',200,'Choco');

-- Baja de Productos
delimiter //
create function Baja_Productos(idproducto int) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
begin
declare message varchar (50);
	if exists((select id from Productos where id like idproducto)) then
		delete from Productos where id like idproducto;
        set message = 'Producto borrado exitosamente';
    else
		set message = 'No se realizó el borrado';
    end if;    
return message;
end // delimiter ;
-- select Baja_Productos(110);

-- Modificaciones a Productos

delimiter //
create function Mod_tipo(idprod int, newtipo varchar(100), newcosto double, newsabor varchar(20)) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
	if (exists(select id from Productos where id like idprod)) then
		update Productos set tipo = newtipo, costo = newcosto, sabor = newsabor where id = idprod;
		set message = 'Modificación realizada';
	end if;
return message;	
END // delimiter ;

delimiter //
create function Mod_id_prod(idprod int, newid int) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
	if (exists(select id from Productos where id like idprod)) then
		update Productos set id = newid where id = idprod;
		set message = 'Modificación realizada';
	end if;
return message;	
END // delimiter ;
SELECT Mod_id_prod(99,0);

DELIMITER // 
CREATE PROCEDURE Mostrar_Productos()  
BEGIN 
SELECT id,tipo,sabor,costo FROM Productos where NOT ( Productos.id = 0);
END // DELIMITER ; 
-- drop procedure Mostrar_Productos;
-- call Mostrar_Producto();

DELIMITER // 
CREATE PROCEDURE Mostrar_Producto(t varchar(20))
BEGIN
declare message varchar(20);
if (exists(select tipo from Productos where tipo like t)) then
	select * from Productos where tipo = t AND NOT ( Productos.id = 0);
else
	set message = 'Producto no encontrado';
end if;
END // DELIMITER ; 
-- drop procedure Mostrar_producto;

DELIMITER // 
CREATE PROCEDURE Mostrar_ProductoID(idp int)
BEGIN
declare message varchar(20);
if (exists(select id from Productos where id like idp)) then
	select id,tipo,sabor,costo from Productos where id = idp; -- IMPORTANTE
else
	set message = 'Producto no encontrado';
end if;
END // DELIMITER ; 

-- drop procedure Mostrar_Producto;
-- drop procedure Mostrar_Productos;
-- call Mostrar_ProductoID(100);

-- Tabla de detalle
delimiter //
Create function Alta_Detalle(idped int, idprod int, cant int, ad varchar(100)) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
	if(exists(select Pedido.id from Pedido where Pedido.id like idped) and 
    exists(select Productos.id from Productos where Productos.id like idprod))then
		insert into detalle_ped_prod (ped_id, prod_id, cantidad, adit) values
        (idped, idprod, cant, ad);
        set message = "Alta exitosa";
	else
		set message = "Alta no realizada";
	end if;
return message;
end // delimiter ;
-- drop function Alta_Detalle;
-- select Alta_Detalle(1506,103,10);

delimiter //
create function Baja_Detalle(idDetalle int)returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
	if(exists(select detalle_ped_prod.id_detpp from detalle_ped_prod where
    detalle_ped_prod.id_detpp like idDetalle))then
		delete from detalle_ped_prod where id_detpp like idDetalle;
        set message = "Baja exitosa";
	else
		set message = "Baja no realizada";
    end if;
return message;
end // delimiter ;
-- select Baja_Detalle(200);

delimiter //
create procedure Mostrar_detalles(idped int)
BEGIN
declare message varchar(50);
	if(exists(select detalle_ped_prod.ped_id from detalle_ped_prod where
    detalle_ped_prod.ped_id like idped))then
		select id_detpp, Productos.tipo, Productos.sabor, cantidad, adit, Productos.costo
		from detalle_ped_prod join Productos
		on detalle_ped_prod.prod_id=Productos.id where detalle_ped_prod.ped_id like
        idped;
	end if;
end // delimiter ;
-- drop procedure Mostrar_detalles;
-- call Mostrar_detalles;

delimiter //
create procedure Mostrar_detalle(iddet int)
BEGIN
declare message varchar(50);
	if(exists(select detalle_ped_prod.id_detpp from detalle_ped_prod where
    detalle_ped_prod.id_detpp like iddet))then
		select id_detpp, cantidad, Productos.tipo, Productos.sabor, adit, Productos.costo, Productos.id
		from detalle_ped_prod join Productos
		on detalle_ped_prod.prod_id=Productos.id where detalle_ped_prod.id_detpp like
        iddet;
	end if;
end // delimiter ;
-- drop procedure Mostrar_detalle;
-- call Mostrar_detalle(207);

-- Modificaciones

delimiter //
create function Mod_cant_detpp(id_det int,cant int) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
	if (exists(select id_detpp from detalle_ped_prod where id_detpp like id_det)) then
		update detalle_ped_prod set cantidad = cant where id_detpp=id_det;
		set message = 'Modificación realizada';
	end if;
return message;	
END // delimiter ;

-- select Mod_cant_detpp(200,4);

delimiter //
create function Mod_adit_detpp(id_det int, newaditivo varchar(100)) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
	if (exists(select id_detpp from detalle_ped_prod where id_detpp like id_det)) then
		update detalle_ped_prod set adit = newaditivo where id_detpp=id_det;
		set message = 'Modificación realizada';
	end if;
return message;	
END // delimiter ;
-- select Mod_adit_detpp(200, 'Sin nada');

delimiter //
create function Mod_prod_detpp(id_det int, id_prod int) returns varchar(50)
READS SQL DATA 
DETERMINISTIC 
BEGIN
declare message varchar(50);
	if (exists(select id_detpp from detalle_ped_prod where id_detpp like id_det)) then
		update detalle_ped_prod set prod_id = id_prod where id_detpp=id_det;
		set message = 'Modificación realizada';
	end if;
return message;	
END // delimiter ;

-- CALCULOS ESTADISTICOS
/*DELIMITER // 
CREATE PROCEDURE dineroGanadoxMes(idpedido int,  mes date)
BEGIN
declare message varchar(50);
if (exists(select id from Pedido where id like idpedido)) then
	select * from Pedido join Cliente on Pedido.id_client=Cliente.id_client where id = idpedido;
else
	set message = 'Pedido no encontrado';
end if;
END // DELIMITER ;*/
--  select avg();
-- call dineroGanadoxMes();
-- drop PROCEDURE dineroGanadoxMes();

select * from Pedido join Cliente on Pedido.id_client=Cliente.id_client where month(fecha)=4;
-- select * from Pedido join Cliente on Pedido.id_client=Cliente.id_client where id = idpedido;

-- GASTO DEL MES 4 POR NOMBRE
select nom_client, costo*cantidad as gasto 
from Detalle_Ped_Prod 
join Productos on prod_id=Productos.id 
join Pedido on ped_id=Pedido.id 
join Cliente on Pedido.id_client=Cliente.id_client
where month(fecha)=4;

-- PROMEDIO DE VENTAS EN EL MES 4
select avg(costo*cantidad) as ventas 
from Detalle_Ped_Prod 
join Productos on prod_id=Productos.id 
join Pedido on ped_id=Pedido.id 
where month(fecha)=4;
-- GASTOS TOTALES DE TODOS LOS TIEMPOS
select nom_client, costo*cantidad as gasto 
from Detalle_Ped_Prod 
join Productos on prod_id=Productos.id 
join Pedido on ped_id=Pedido.id 
join Cliente on Pedido.id_client=Cliente.id_client;
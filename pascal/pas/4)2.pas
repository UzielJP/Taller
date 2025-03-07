program arbol2;
type

registropl=record//registro por libro
	isbn:integer;//isbn del libro
	nums:integer;//numero de socio
	dia:integer;//dia de prestamo
	mes:integer;//mes del prestamo
	cantdp:integer;//cantidad de dias prestado
end;

pxl=^arbolxp;//puntero arbol  de libros;

arbolxp=record
	infol:registropl;
	hi:pxl;
	hd:pxl;
end;

pa=^listalum;

listalum=record
	infol:registropl;
	sig:pa;
end;

pxt=^arboltot;//Puntero total pretamos

arboltot=record//arbol total de libros por isbn
	isbn:integer;//isbn del libro
	sig:pa;
	hd:pxt;
	hi:pxt;
end;

//consigna F:
pl=^listaf;

listaf=record //Lista F;
isbn:integer;
cantv:integer;
sig:pl;
end;

procedure cleal(var l:pl; n:integer);
begin
if(l<>nil)then begin
cleal(l^.sig,n);
if(l^.isbn=n)then
l^.cantv:=l^.cantv+1;
end
else begin
new(l);
l^.isbn:=n;
l^.cantv:=0;
end;
end;

procedure lecolel(p:pxl; var l:pl);
begin
if(p<>nil)then begin
lecolel(p^.hi,l);
lecolel(p^.hd,l);
cleal(l,p^.isbn);
end;
end;



//Consigna F:


procedure leerxl(var r:registropl);//modulo leer registro;
	begin
			writeln('leer isbn');
				readln(r.isbn);
		if (r.isbn<>-1)then begin
			writeln('leer numero socio');
				readln(r.nums);
			writeln('leer dia');
				readln(r.dia);
			writeln('leer mes');
				readln(r.mes);
			writeln('leer cantidad de dias prestado');
				readln(r.cantdp);
		end;
	end;

//Creacion de arboles
procedure creartot(var a:pxl; r:registropl);//modulo crear arbol con info socio;
	begin
		if(a<>nil)then
			begin
				if(r.isbn<a^.infol.isbn)then begin
					writeln('llendo a la izquierda en pxl :O');
					creartot(a^.hi,r);
					end
				else begin
					writeln('llendo a la derecha en pxl :O');
					creartot(a^.hd,r)
					end
			end
		else begin
			writeln('creando nuevo nodo para pxl :D');
			new(a);
			a^.infol:=r;
			a^.hi:=nil;
			a^.hd:=nil;
	end;
end;

//crear Lista
procedure crearl(var l:pa; r:registropl);//modulo buscar y crear lista dentro del arbol;
	begin
			if(l<>nil)then begin
				writeln('avanzando en pa :O');
				crearl(l^.sig,r)
				end
			else begin
				writeln('creando nuevo nodo para la lista pa :D');
				new(l);
				l^.infol:=r;
			end;
		end;
	
//Crear Arbol de Listas
procedure crearb(var a:pxt; r:registropl);//modulo crear arbol con lista de libros prestados;
	begin
			if(a<>nil)then begin
					if(r.isbn<>a^.isbn)then begin
						writeln('llendo hacia la izquierda en pxt :O');
							crearb(a^.hi,r);
						writeln('llendo hacia la derecha en pxt :O');
							crearb(a^.hd,r);
					end
				else 
					crearl(a^.sig,r);
				end
			else begin
				writeln('creando nuevo nodo para pxt :D');
				new(a);
				a^.sig:=nil;
				a^.hi:=nil;
				a^.hd:=nil;
				crearl(a^.sig,r);
			end
	end;
	
procedure cargari(var a:pxt; var b:pxl);//modulo general
	var
	r:registropl;
begin
	leerxl(r);
	while(r.isbn<>-1)do begin
		creartot(b,r);
		crearb(a,r);
		leerxl(r);
	end;
end;

//Consigna B:
procedure buscarmi(a:pxl; var max:integer);//modulo buscar maximo
	begin
			if(a<>nil)then begin
				if(max<a^.infol.isbn)then begin
				max:=a^.infol.isbn;
				buscarmi(a^.hd,max);
				end
			else
		end;
	end;
	
//Consigna C:
procedure buscarmi2(a:pxt; var min:integer);//modulo buscar minimo
	begin
			if(a<>nil)then begin
				buscarmi2(a^.hi,min);
				if(min>a^.sig^.infol.isbn)then begin
				min:=a^.sig^.infol.isbn;
				end
			else
		end;
	end;

//Consigna D:
Procedure prestamosoc(a:pxl; num:integer; var mun:integer);
begin
if(a<>nil)then begin
prestamosoc(a^.hi,num,mun);
prestamosoc(a^.hd,num,mun);
if(num=a^.infol.nums)then
mun:=mun+1;
end;
end;

//consigna E:
{procedure prestamosocl(a:pa; num:integer; var mun2:integer);
begin
while(a<>nil)do begin
if(num=a^.infol.nums)then begin
mun2:=mun2+1
end;
end;
end;
if(a<>nil)then begin
prestamosocl(a^.sig,num,mun2);
if(num=a^.infol.nums)then
mun2:=mun2+1;}



//Consigna E:
{procedure prestamosoc2(a:pxt; num:integer; var mun2:integer);
	begin
			if(a<>nil)then begin
				prestamosocl(a^.sig,num,mun2);
				prestamosoc2(a^.hi,num,mun2);
				prestamosoc2(a^.hd,num,mun2);
			end;
	end;}




var
pt:pxt;
pl:pxl;
max:integer;
min:integer;
mun:integer;
mun2:integer;
num:integer;
num2:integer;
begin
mun:=0;
mun2:=0;
pt:=nil;
max:=-1;
min:=9999;
pl:=nil;
cargari(pt,pl);
buscarmi(pl,max);
buscarmi2(pt,min);
writeln ('el numero mas grande del modulo es ',max);
writeln(min);
readln(num);
prestamosoc(pl,num,mun);
writeln(mun);
readln(num2);
//prestamosoc2(pt,num2,mun2);
writeln(mun2);
end.
























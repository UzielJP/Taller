program hola;

type

pa=^arbola;//Puntero al  arbol;

arbola= record//Arbol Almacen
utv:integer;//unidades total vendidas
mt:real;//Monto total;
codigo:integer;//Codigo Producto;
hi:pa;//hoja izquierda;
hd:pa;//hoja derecha;
end;

procedure buscara (var a:pa; codigo:integer;mt:real;utv:integer); //crea al nodo al arbol y busca un espacio;

begin
	if(a<>nil)then begin
			writeln('el nodo no esta vacio');
			if(codigo<a^.codigo)then
				begin
				writeln('vamos a la izquierda');
				buscara(a^.hi,codigo,mt,utv)
				end
			else
				begin
				writeln('vamos a la derecha');
				buscara(a^.hd,codigo,mt,utv)
				end
		end
		else 
				begin
				 writeln('creando nuevo nodo :D');
				 new(a);
				 a^.mt:=mt;
				 a^.utv:=utv;
				 a^.codigo:=codigo;
				 a^.hi:=nil;
				 a^.hd:=nil;
				 end
	
		
end;

procedure imprimir(a:pa);
begin
	if (a<>nil) then begin
		imprimir(a^.hi);
		writeln('codigo: ',a^.codigo);
		writeln('unidades totales vendidas ',a^.utv);
		writeln('Monto total de ganancias  ',a^.utv);
		imprimir(a^.hd);
	end
end;

procedure menor(a:pa; var cantnume:integer; nume:integer);
begin
		if (a<>nil)then begin
			menor(a^.hi,cantnume,nume);
				if (nume>a^.codigo)then begin
					cantnume:=cantnume+1;
					menor(a^.hd,cantnume,nume);
		end;
	end;
end;

procedure entrel(a:pa;var totalm:real;num1:integer;num2:integer);
begin
	if (a<>nil)then begin

		entrel(a,totalm,num1,num2);
		entrel(a,totalm,num1,num2);
	end;
end;


procedure maximo(a:pa; var max:integer; var codmax:integer);
begin
	if (a<>nil) then begin
	maximo(a^.hi,max,codmax);
	if(max<a^.utv)then begin
			max:=a^.utv;
			codmax:=a^.codigo;
	end;
	maximo(a^.hd,max,codmax);
	end;
end;


procedure cargara(var a:pa); //carga los libros al arbol;
	var
		codigop:integer;//codigo producto;
		//codventa:integer;//codigo venta;
		cantuv:integer;//cantidad unidades vendidas;
		preciou:real;// precio por unidad;
		codigoact:integer;//codigo actual;
		utv:integer;//unidades total vendidas;
		mt:real;//Monto total;

	begin
		writeln('leer codigo de producto');
		readln(codigop);
		while(codigop<>-1)do begin
			utv:=0;
			mt:=0;
			codigoact:=codigop;
				while(codigop<>-1)and (codigoact=codigop)do begin
					//writeln('leer codigo de venta');
					//readln(codventa);
					writeln('leer precio por unidad');
					readln(preciou);
					writeln('leer cantidad unidades vendidas');
					readln(cantuv);
					utv:=utv+cantuv;
					cantuv:=cantuv;
					mt:=mt+cantuv*preciou;
					writeln('leer nuevo codigo de producto');
					readln(codigop);
				end;
			buscara(a,codigoact,mt,utv);
			codigoact:=codigop;
		end;
	end;

var
a:pa;
max:integer;
codmax:integer;
//cantnume:integer;
//nume:integer;
num1:integer;
num2:integer;
totalm:real;
begin
totalm:=0;
max:=-1;
//cantnume:=0;
a:=nil;
writeln('numero 1');
readln(num1);
writeln('numero 2');
readln(num2);
//readln(nume);
cargara(a);
maximo(a,max,codmax);
//menor(a,cantnume,nume);
writeln('maximo: ',max);
writeln('maximo: ',codmax);
entrel(a,totalm,num1,num2);
writeln('entre ',num1,' y ',num2,' hay',totalm,' numeros');
//writeln('cant numero: ',cantnume);
//imprimir(a);
end.

















































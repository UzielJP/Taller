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
begin
a:=nil;
cargara(a);
end.

















































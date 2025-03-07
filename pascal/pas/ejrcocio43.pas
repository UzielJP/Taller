program ejercicio43;
type
 materias=1..4;
 notas=1..10;

 vectora= array [1..4] of integer;

 pa=^arbola;

 arbola=record
	materias:vectora;
	codalum:integer;
	hd:pa;
	hi:pa;
 end;

pl2=^lista2;

lista2=record
	cantfa:integer;
	codigo:integer;
	sig:pl2;
end;

 pl=^listal;

 listal=record
	nota:notas;
	codalum:integer;
	sig:pl;
 end;

 vectorm=array [1..4] of pl;

 pls=^lsuperior;

 lsuperior=record
	prom:integer;
	codigo:integer;
	sig:pls;
 end;

 procedure creara(var a:pa; v:vectora; c:integer);
	begin
		if(a<>nil)then 
		begin
			writeln('El arbol no esta vacio :)');
				if(c<a^.codalum)then begin
						writeln('Vamos hacia la izquierda :0');
					creara(a^.hi,v,c)
					end
				else
						writeln('Vamos hacia la derecha :0');
					creara(a^.hd,v,c)
				end
			else 
			begin
				writeln('Creando nuevo nodo dentro del arbol :D');
				new(a);
				a^.codalum:=c;
				a^.materias:=v;
				a^.hd:=nil;
				a^.hi:=nil;
			end
	end;
	
 procedure crearl(var l:pl; c:integer; n:notas);
	begin
		if(l<>nil)then begin
			writeln('La lista dentro del vector Materias no esta vacia :o');
			crearl(l^.sig,c,n)
			end
		else begin
			writeln('Creando nodo en la lista Dentro del vector de materias :D');
			new(l);
			l^.nota:=n;
			l^.codalum:=c;
		end;
	end;

 procedure cargarv(var v:vectora; var vm:vectorm; c:integer);
	var 
	i:integer;
	nota:notas;
	begin
		for i:=1 to 4 do begin
			v[i]:=0;
			writeln('Repeticion numero ',i);
			writeln('Ingresar nota');
			readln(nota);
			crearl(vm[i],c,nota);
		if(nota>4)then begin
			writeln('aprobaste el final felicidades :D');
			v[i]:=nota;
			end
		end;
	end;

 procedure cargara(var vm:vectorm; var a:pa);
	var
	v:vectora;
	c:integer;
	begin
		writeln('Leer codigo del alumno');
		readln(c);
			while (c<>-1) do begin
				cargarv(v,vm,c);
				creara(a,v,c);
				writeln('Leer codigo de otro alumno');
				readln(c);
			end;
	end;

procedure promedio(v:vectora; var p:integer);
	var
	i:integer;
	num:integer;
	begin
		num:=0;
		for i:=1 to 4 do begin
		num:=num+v[i];
	end;
	p:= num div 4;
end;

procedure crearli(var l:pls; v:vectora; c:integer);
	var
	aux:pls;
	p:integer;
	begin
		new(aux);
		promedio(v,p);
		aux^.prom:=p;
		aux^.codigo:=c;
		aux^.sig:=l;
		l:=aux;
	end;

procedure crearle(var l:pl2;c:integer;num:integer);
	var
	aux:pl2;
	begin
		if(l<>nil)then
			crearle(l^.sig,c,num)
		else begin
			new(aux);
			l^.cantfa:=num;
			l^.codigo:=c;
			aux^.sig:=l;
			l:=aux;
		end
	end;

 procedure creareso(a:pa; c:integer; var l:pls);
 
	begin
		if(a<>nil)then begin
			if(a^.codalum>c)then begin
				creareso(a^.hi,c,l);
				crearli(l,a^.materias,a^.codalum);
				creareso(a^.hd,c,l);
				end
			else
				creareso(a^.hd,c,l);
		end;
	end;

 procedure recorrerl(l:pls);
  begin
	 if(l<>nil)then begin
		 writeln('El promedio del alumno ',l^.codigo,' es ',l^.prom);
		 recorrerl(l^.sig);
	 end
  end;
  
  procedure darvuelta(var n1:integer; var n2:integer);
	  var
	  aux:integer;
	  begin
	  readln(n1);
	  readln(n2);
		  if (n1>n2)then
		   begin
			  aux:=n1;
			  n1:=n2;
			  n2:=aux;
		   end
	  end;
  
  procedure contar(v:vectora; var num:integer);
	  var
	  i:integer;
	  begin
		  for i:=1 to 4 do begin
			  if(v[i]>4)then
			  num:=num+1;
		  end;
	  end;
	  
 procedure cantf(a:pa; n1:integer; n2:integer; var p:pl2);
 var
 num:integer;
 begin
	 if(a<>nil) then begin
		  contar(a^.materias,num);
		  if(num>=n1)then 
			  begin
				  if(num<=n2)then 
					  begin
						  crearle(p,a^.codalum,num);
						  cantf(a^.hi,n1,n2,p);
						  cantf(a^.hd,n1,n2,p);
					  end
				  else
					cantf(a^.hi,n1,n2,p);
			   end
		  else
			cantf(a^.hd,n1,n2,p);
	  end
 end;
 
 procedure leerr(p:pl2);
 begin
 if (p<>nil)then begin
 writeln(p^.cantfa);
 p:=p^.sig;
 end;
 end;
 

var
vm:vectorm;
a:pa;
l:pls;
c:integer;
n1:integer;
n2:integer;
p:pl2;
begin
p:=nil;
l:=nil;
a:=nil;
cargara(vm,a);
writeln('ingresar codigo');
readln(c);
creareso(a,c,l);
recorrerl(l);
darvuelta(n1,n2);
cantf(a,n1,n2,p);
leerr(p);
end.











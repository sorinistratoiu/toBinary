package conversie;

import java.util.*;

public class Conv{

 //functie pentru conversia unui numar din baza 10 intr-un 
 //numar in baza 2 specificand numarul de biti
  public static String convZecimalBinar(int nr10,int nrB){
	  String s="";
	  //daca numarul este pozitiv primul bit este 0
	  if(nr10>0)  {
		  for(int j=0;j < nrB-1;j++){
			  if( nr10%2==1 ){
				s='1'+s;
			  }
			  if( nr10%2==0 ){
				s='0'+s;
			  }
			  nr10=nr10/2;
		  }
		  s='0'+s;
}
  else{
	  //daca numarul este negativ primul bit este 1
	  nr10=Math.abs(-nr10);
	  for(int j=0;j < nrB-1;j++){
		  if( nr10%2==1 ){
			s='1'+s;
		  }
		  if( nr10%2==0 ){
			s='0'+s;
		  }
		  nr10=nr10/2;
	  }
	  s='1'+s;
  }  
  return s;
  }
  
  //functie pentru calculul complementului fata de 2
  public static String C2(int nr10,int nrB){
	  String s="";
	  nr10=Math.abs(-nr10);
	  for(int j=0;j < nrB-1;j++){
		  if( nr10%2==1 ){
			s='1'+s;
		  }
		  if( nr10%2==0 ){
			s='0'+s;
		  }
		  nr10=nr10/2;
	  }
	  s='1'+s;
	  return s;
  }



}
  
   
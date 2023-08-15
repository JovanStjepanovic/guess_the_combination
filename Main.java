
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		
		
		 int pick;	
						 	
		 Random random = new Random();
							
		 LinkedList<Integer>kombinacija = new LinkedList<Integer>();
		LinkedList<Integer>nagadjanje= new LinkedList<Integer>();
						
						
		Scanner scanner = new Scanner(System.in);
							
		   
      int numb=0;
     int poeni6=30;
	int poeni7= 20;	
		int zbir=0;	

		int igratiponovo =0;
			  
				        try {
							
						do {

						for(int i =0 ; i <4; i++) {
							pick= random.nextInt(1, 7);
							kombinacija.add(pick);
							
							}
							System.out.println(kombinacija);
						    System.out.println("Dobro dosli u Skocko igru, imate 7 pokusaja da pogodite kombinaciju.");
						    System.out.println("Elementi se krecu od 1 do 6 ,brojevi se mogu ponavljati. Elemente unosite jedan po jedan");
							
							 
							
	
							do {
				           
								numb++;	 
								 nagadjanje.clear();
						         System.out.println("--------------------");
							 System.out.println("Pogadanje broj :"+numb);
							
							for(Integer k :Arrays.asList(scanner.nextInt(), scanner.nextInt(),scanner.nextInt(), scanner.nextInt())) {
								
							nagadjanje.add(k);
							}
							
							
							
							
							 boolean jp1= nagadjanje.get(0)== kombinacija.get(0) || nagadjanje.get(1)== kombinacija.get(1) || nagadjanje.get(2)== kombinacija.get(2)  || nagadjanje.get(3)== kombinacija.get(3);
							
						     boolean dpv1= (kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(1)==nagadjanje.get(1)) || (kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(2)==nagadjanje.get(2)) || (kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(3)==nagadjanje.get(3))   ;
						     boolean dpv2= (kombinacija.get(1)==nagadjanje.get(1)&& kombinacija.get(2)==nagadjanje.get(2)) || (kombinacija.get(1)==nagadjanje.get(1)&& kombinacija.get(3)==nagadjanje.get(3));
						     boolean dpv3= (kombinacija.get(2)==nagadjanje.get(2)&& kombinacija.get(3)==nagadjanje.get(3)) ;
						     
						     boolean trp1= (kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(1)==nagadjanje.get(1) &&kombinacija.get(2)==nagadjanje.get(2));
						     boolean trp2=(kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(1)==nagadjanje.get(1) &&kombinacija.get(3)==nagadjanje.get(3));
							 boolean trp3=(kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(2)==nagadjanje.get(2) &&kombinacija.get(3)==nagadjanje.get(3));
							 boolean trp4=(kombinacija.get(1)==nagadjanje.get(1)&& kombinacija.get(0)==nagadjanje.get(0) &&kombinacija.get(2)==nagadjanje.get(2));
							 boolean trp5=(kombinacija.get(1)==nagadjanje.get(1)&& kombinacija.get(0)==nagadjanje.get(0) &&kombinacija.get(3)==nagadjanje.get(3));
							 boolean trp6=(kombinacija.get(1)==nagadjanje.get(1)&& kombinacija.get(2)==nagadjanje.get(2) &&kombinacija.get(3)==nagadjanje.get(3));
							 
							 
							 boolean jpvm= (nagadjanje.contains(kombinacija.get(0)) )    ||  (nagadjanje.contains(kombinacija.get(1)) ) ||   (nagadjanje.contains(kombinacija.get(2))  ) || (nagadjanje.contains(kombinacija.get(3)) )    ;
							
							 boolean dvpm1=(nagadjanje.contains(kombinacija.get(0)) && nagadjanje.contains(kombinacija.get(1)) )  ||  (nagadjanje.contains(kombinacija.get(0)) && nagadjanje.contains(kombinacija.get(2)) )  || (nagadjanje.contains(kombinacija.get(0)) && nagadjanje.contains(kombinacija.get(3)) ) ;
							 boolean dvpm2=(nagadjanje.contains(kombinacija.get(1)) && nagadjanje.contains(kombinacija.get(2)) )  ||  (nagadjanje.contains(kombinacija.get(1)) && nagadjanje.contains(kombinacija.get(3)) ) ;
							 boolean dvpm3= (nagadjanje.contains(kombinacija.get(2)) && nagadjanje.contains(kombinacija.get(3)) );
							 boolean dvpm4=(nagadjanje.contains(kombinacija.get(1)) && nagadjanje.contains(kombinacija.get(0)) );
							 boolean dvpm5=(nagadjanje.contains(kombinacija.get(2)) && nagadjanje.contains(kombinacija.get(0)) );
							 boolean dvpm6=(nagadjanje.contains(kombinacija.get(2)) && nagadjanje.contains(kombinacija.get(1)) );
							 boolean dvpm7=(nagadjanje.contains(kombinacija.get(3)) && nagadjanje.contains(kombinacija.get(0)) );
							 boolean dvpm8=(nagadjanje.contains(kombinacija.get(3)) && nagadjanje.contains(kombinacija.get(1)) );
							 boolean dvpm9=(nagadjanje.contains(kombinacija.get(3)) && nagadjanje.contains(kombinacija.get(2)) );
							 
							 
							 
							 
							 
							 
							 boolean trvm1=(nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(2)));
							 boolean trvm2 =(nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(3)));
							 boolean trvm3=(nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(2))) && (nagadjanje.contains(kombinacija.get(3)));
							 boolean trvm4=(nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(2)));
							 boolean trvm5=(nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(3)));
							 boolean trvm6=(nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(2))) && (nagadjanje.contains(kombinacija.get(3)));
							 
							 boolean trvm7=(nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(3))) && (nagadjanje.contains(kombinacija.get(0)));
							 boolean trvm8 =(nagadjanje.contains(kombinacija.get(2))) && (nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(1)));
							 boolean trvm9=(nagadjanje.contains(kombinacija.get(2))) && (nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(3)));
							 boolean trvm10=(nagadjanje.contains(kombinacija.get(2))) && (nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(0)));
							 boolean trvm11=(nagadjanje.contains(kombinacija.get(2))) && (nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(3)));
							 boolean trvm12=(nagadjanje.contains(kombinacija.get(2))) && (nagadjanje.contains(kombinacija.get(3))) && (nagadjanje.contains(kombinacija.get(0)));
							 boolean trvm13=(nagadjanje.contains(kombinacija.get(2))) && (nagadjanje.contains(kombinacija.get(3))) && (nagadjanje.contains(kombinacija.get(1)));
							 boolean trvm14=(nagadjanje.contains(kombinacija.get(3))) && (nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(0)));
							 boolean trvm15=(nagadjanje.contains(kombinacija.get(3))) && (nagadjanje.contains(kombinacija.get(1))) && (nagadjanje.contains(kombinacija.get(2)));
							 boolean trvm16=(nagadjanje.contains(kombinacija.get(3))) && (nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(1)));
							 boolean trvm17=(nagadjanje.contains(kombinacija.get(3))) && (nagadjanje.contains(kombinacija.get(0))) && (nagadjanje.contains(kombinacija.get(2)));
							 
							 
							 
							 
							 
							 
							 
							 
							 boolean cetvm=  nagadjanje.contains(kombinacija.get(0)) && nagadjanje.contains(kombinacija.get(1)) && nagadjanje.contains(kombinacija.get(2)) && nagadjanje.contains(kombinacija.get(3));
							 
							 boolean trpVM= (trvm1 || trvm2 || trvm3 ||trvm4 || trvm5 || trvm6 || trvm7 || trvm8 || trvm9 || trvm10 || trvm11 || trvm12 || trvm13 || trvm14 || trvm15 || trvm16 || trvm17);
							 boolean dpVM= (dvpm1 || dvpm2 || dvpm3 ||dvpm4 || dvpm5 || dvpm6 || dvpm7 || dvpm8 || dvpm9);
							 
							 boolean trpNM=(trp1 || trp2 || trp3 || trp4 || trp5|| trp6);
							 boolean dpNM= (dpv1 || dpv2 || dpv3 );
							 boolean triv1N=trpVM && jp1;
							 boolean dvaVN2NApvideo=( kombinacija.get(0) == nagadjanje.get(0) &&   kombinacija.get(1) == nagadjanje.get(1)   && nagadjanje.contains(kombinacija.get(2))    && nagadjanje.contains(kombinacija.get(3)) );
							 boolean dvaVN2NAdrugiodeo= ( kombinacija.get(2) == nagadjanje.get(2) &&   kombinacija.get(3) == nagadjanje.get(3)   && nagadjanje.contains(kombinacija.get(1))    && nagadjanje.contains(kombinacija.get(0)) );
			                 boolean dvaVN2NAtrecideo=( kombinacija.get(0) == nagadjanje.get(0) &&   kombinacija.get(3) == nagadjanje.get(3)   && nagadjanje.contains(kombinacija.get(1))    && nagadjanje.contains(kombinacija.get(2)) );
			                 boolean dvaVN2NAcetvrtiodeo= ( kombinacija.get(0) == nagadjanje.get(0) &&   kombinacija.get(2) == nagadjanje.get(2)   && nagadjanje.contains(kombinacija.get(3))    && nagadjanje.contains(kombinacija.get(1)) );
			                 boolean dvaVN2NApetideo=( kombinacija.get(1) == nagadjanje.get(1) &&   kombinacija.get(3) == nagadjanje.get(3)   && nagadjanje.contains(kombinacija.get(2))    && nagadjanje.contains(kombinacija.get(0)) );
			                 boolean dvaVN2NAsestiodeo=( kombinacija.get(1) == nagadjanje.get(1) &&   kombinacija.get(2) == nagadjanje.get(2)   && nagadjanje.contains(kombinacija.get(3))    && nagadjanje.contains(kombinacija.get(0)) );
			                 boolean dvaVN2NA=( dvaVN2NApvideo ||  dvaVN2NAdrugiodeo   || dvaVN2NAtrecideo  || dvaVN2NAcetvrtiodeo   || dvaVN2NApetideo  || dvaVN2NAsestiodeo  );
			                 boolean brojvanElemanata= (nagadjanje.get(0)>6  ||   nagadjanje.get(1)>6 ||  nagadjanje.get(2)>6 ||  nagadjanje.get(3)>6  );
			                 boolean brojvanElemanata2= (nagadjanje.get(0)<1 ||   nagadjanje.get(1)<1 ||  nagadjanje.get(2)<1||  nagadjanje.get(3)<1  );
			                 
							 if(kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(1)==nagadjanje.get(1) && kombinacija.get(2)==nagadjanje.get(2)&& kombinacija.get(3)==nagadjanje.get(3)) {
							    
								System.out.println("Pogodili ste kombinaciju :"+kombinacija);
						
							 }
					
							 else if(brojvanElemanata || brojvanElemanata2) {
							 System.out.println("Elementi moraju da se nalaze u opsegu od 1 do 6");
							 }
							 
							 else if (trpNM) {
								 System.out.println("Imate tri pogodka tri su na tacnoj poziciji");
								 
								 }	   
							 else if ((trpVM != trpNM) && trpVM!=(dpNM &&  dpVM)   && trpVM!= ( trpVM && jp1) && (trpVM!= cetvm)) {
							 
							 System.out.println("Imate tri pogodka van mesta");
						
							 }
							 

							 else if(dvaVN2NA ) {
								 
									System.out.println("Imate dva pogodka van pozicije dva pogodka na poziciji");
												
							 }
			
			
							 
							 else if(  dpNM ) {
									 
									 System.out.println("Imate dva pogodka sa dve tacne pozicije"); 
												 
							  }
							  
							 else if(dpVM != dpNM && dpVM !=dvaVN2NA && dpVM !=cetvm) {
								 
								 System.out.println("Imate dva pogodka van mesta");
								
								 				 	 
							 }
							 
							  
							 else if( triv1N !=dpNM  &&  triv1N !=dvaVN2NA ) {
								 System.out.println("imate tri pogodka van pozicije i jedan na poziciji"); 
								 
								 }
					
							  
							  
							 else  if (jp1) {

								  System.out.println("Imate jedan pogodak  sa jednom tacnom pozicijom"); 
								 
								     } 		  
							  
							else   if (jpvm != cetvm) {
							 System.out.println("Imate jedan pogodak van tacne pozicije");
				
							}
							 
							
							 else if( cetvm !=trpNM  ) {
								 System.out.println("Imate cetiri pogodka van mesta"); 
								 
								 
								 }
			
							else {	
								System.out.println("Nula pogodaka");	
									
							}
                         
                          if(  (kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(1)==nagadjanje.get(1) && kombinacija.get(2)==nagadjanje.get(2)&& kombinacija.get(3)==nagadjanje.get(3))  && numb<6)   {
							zbir = zbir+ poeni6;
							System.out.println("pogodili ste kombinaciju iz :"+numb +".pokusaja "+" dobili ste "+ poeni6+" "+"poena");
                          }
                          else if((kombinacija.get(0)==nagadjanje.get(0)&& kombinacija.get(1)==nagadjanje.get(1) && kombinacija.get(2)==nagadjanje.get(2)&& kombinacija.get(3)==nagadjanje.get(3))  && numb==7) {
                          
                          	zbir = zbir+ poeni7;
                      
                          System.out.println("Pogodili ste kombinaciju iz :"+numb +".pokusaja "+" dobili ste "+ poeni7+"poena");
                         
                          }
                          
                         
						
}while( numb<=6 && (nagadjanje.get(0)  != kombinacija.get(0)   || nagadjanje.get(1) != kombinacija.get(1)  || nagadjanje.get(2) != kombinacija.get(2) || nagadjanje.get(3) != kombinacija.get(3))) ;
							if(numb>=7 || (nagadjanje.get(0)  != kombinacija.get(0)   || nagadjanje.get(1) != kombinacija.get(1)  || nagadjanje.get(2) != kombinacija.get(2) || nagadjanje.get(3) != kombinacija.get(3))) {
								System.out.println("Niste pogodili kombinaciju :"+kombinacija);
								}
						System.out.println("Konacan zbir je :"+zbir+" " +"da li hocete jos da igrate?");
						System.out.println("Ako hocete opet da igrate unesite 1");
						igratiponovo=	scanner.nextInt();	
					kombinacija.clear();
					 numb= numb-numb;
						}while (igratiponovo==1)	;					
				        } catch (IndexOutOfBoundsException e) {
			
						}
						catch (InputMismatchException e2) {
							System.out.println("Kombinacija ne moze sadrzati slova.Pokrenite igru ispocketka  ");
						  
							
						 
						
						}		
							
							
		          scanner.close();
				        
				        	
	
		
	
	
	
		
		
		

	}

}

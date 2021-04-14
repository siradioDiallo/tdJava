package tdjava;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean quitter = true;
		Scanner sc= new Scanner(System.in);
		
		String menuPrincapl = "1-Gestion Groupe\n2-Gestion Etudiant\n3-Gestion Professeurs\n4-Gestion Groupe-Etudiant\n5-Quitter";
		String menu1 = "1-Créer un Groupe\n2-Modifier un Groupe\n3-Voir les détails d'un Groupe\n4-Supprimer un groupe\n5-Afficher tous les groupes\n6-Quitter";
		String menu2 = "1-Ajouter un Etudiant\n2-Modifier un Etudiant\n3-Voir les Détails d'un Etudiant\n4-Supprimer un Etudiant\n5-Afficher tous les Etudiants\n6-Quitter";
		String menu3 = "1-Ajouter un Professeur\n2-Modifier un Professeur\n3-Voir les Détails d'un Professeur\n4-Supprimer un Professeur\n5-Afficher tous les Professeur\n6-Quitter";
		
		Etudiant etudiant1 = new Etudiant(12,"0160","M","Diop","Moussa","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","785256635","diop@gmail.com","B");
		Etudiant etudiant2 = new Etudiant(12,"0060","F","Sarr","Fatou","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","785256635","sarr@gmail.com","A");
		Etudiant etudiant3 = new Etudiant(12,"5067","M","Diouf","Ousmane","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","785256635","diop@gmail.com","B");
		Etudiant etudiant4 = new Etudiant(12,"5000","F","DIop","Astou","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","785256635","sarr@gmail.com","A");
		
		Professeur professeur = new Professeur(12,"5060","M","Diop","Moussa","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","785256635","diop@gmail.com","Java");
	   
		Etudiant[] tabEt = new Etudiant[2];
		tabEt[0]=etudiant1;
		tabEt[1]=etudiant2;
		
		Etudiant[] tabEt2 = new Etudiant[2];
		tabEt2[0]=etudiant3;
		tabEt2[1]=etudiant4;
		
		Groupe pr213 = new Groupe("pr213");
		Groupe pr100 = new Groupe("pr100");
	
		//Création des groupes d'étudiant
	    GroupeEtudiant groupePr213 = new GroupeEtudiant(pr213,tabEt);
	    GroupeEtudiant groupePr100 = new GroupeEtudiant(pr100,tabEt2);
	    
	    //Insertion des GroupeEtudiant dans le tableau des Groupes d'étudiant
	    GroupeEtudiant[] tabGrpEtd = new GroupeEtudiant[2];
	    tabGrpEtd[0]=groupePr213;
	    tabGrpEtd[1]=groupePr100;
	    
	    /*
	    System.out.print("Le Groupe:");
	    System.out.println(groupePr213.getGroupe().getNom());
	    
	    for(Etudiant ets:tabEt) {
	    	System.out.println("Nom:"+ets.getNom()+" Prenom:"+ets.getPrenom()+" Matricule:"+ets.getMatricule());
	    }
	    */

	    do {
	    	System.out.println(menuPrincapl);
	    	int choix=sc.nextInt();
	    	sc.nextLine();
	    	switch(choix) {
	    	  case 1:
	    		  boolean quit = true;
		    	   do {
		    	        System.out.println(menu1);
		    	        int choix11=sc.nextInt();
		    	        switch(choix11) {
		    	        case 6: quit=false;break;
		    	        default:System.out.println("Indisponible pour le moment");
		    	        }
		    	        
		    	      }
		    	       while(quit);
		    	       break;
		    	          
	    	  case 2:System.out.println(menu2);break;
	    	  case 3:System.out.println(menu3);break;
	    	  case 4:
	    		 System.out.println("Donnez le nom du groupe");
	    		 String groupeDonne = sc.nextLine().trim();
	    		 for(int i=0;i<tabGrpEtd.length;i++) {
	    			 
	    			 if(tabGrpEtd[i].getGroupe().getNom().toLowerCase().equals(groupeDonne.toLowerCase())) {
	    				 boolean quitter2 = true;
	    				 do {
	    					 System.out.println("1-Afficher les étudiants du groupe\n2-Modifier le nom du groupe\n3-Quitter");
			    			 int choix4=sc.nextInt();
			    			 switch(choix4) {
			    			   case 1: for(Etudiant ets:tabGrpEtd[i].getEtudiant()) {
			    			    	System.out.println("Nom:"+ets.getNom()+" Prenom:"+ets.getPrenom()+" Matricule:"+ets.getMatricule());
			    			    } System.out.println("");break;
			    			   case 2:
			    				   sc.nextLine();
			    				   System.out.println("Saisissez un nom:");
			    				   String nomN= sc.nextLine();
			    				   tabGrpEtd[i].getGroupe().setNom(nomN);
			    				   System.out.println("Le nouveau nom du groupe est:"+tabGrpEtd[i].getGroupe().getNom()+"\n");
			    				   break;  
			    			   case 3:quitter2=false;break;
			    			   default : System.out.println("erreur !");
			    			 } 
	    				 }
	    				 while (quitter2);
	
	    			   }//fin if
	    			
	    		 } //fin de la boucle for
	    		 
	    		  break;
	    	  case 5:System.out.println("Vous Avez quitter ");quitter=false;break;
	    	  default :System.out.println("Erreur !");
	    	}
	    	System.out.println("\n");
	         
	    }
	    while(quitter);
	    
	}

}

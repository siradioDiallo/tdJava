package tdjava;

public class Etudiant extends Personne{
  private String groupeSanguin;
  


public Etudiant(int id,String matricule,String genre,String nom,String prenom,String adresse,
  String dateDeNaissance,String lieuDeNaissance,String nationalite,String situationMatri,String tel,
  String email,String groupeSanguin) 
  {
	  super(id,matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,
			  tel,email);
	  this.groupeSanguin=groupeSanguin;
  }
public String getGroupeSanguin() {
	return groupeSanguin;
}

public void setGroupeSanguin(String groupeSanguin) {
	this.groupeSanguin = groupeSanguin;
}

@Override
public String toString() {
	return super.toString()+" groupeSanguin=" + groupeSanguin;
}

}

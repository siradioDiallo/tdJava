package tdjava;

public class GroupeEtudiant {
	private Groupe groupe;
	private Etudiant[] etudiant;
	
	public GroupeEtudiant() {
		
	}
	
	public GroupeEtudiant(Groupe groupe, Etudiant[] etudiant) {
		super();
		this.groupe = groupe;
		this.etudiant = etudiant;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public Etudiant[] getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant[] etudiant) {
		this.etudiant = etudiant;
	}
	@Override
	public String toString() {
		return "GroupeEtudiant [groupe=" + groupe + ", etudiant=" + etudiant + "]";
	}
	
	

}

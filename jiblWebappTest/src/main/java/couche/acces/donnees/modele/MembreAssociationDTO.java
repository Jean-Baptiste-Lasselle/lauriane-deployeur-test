package couche.acces.donnees.modele;

public class MembreAssociationDTO {
	
	public MembreAssociationDTO() {
		super();
//		java.lang.Exception
		
	}
	/**
	 * Sont demandés à l'inscription / création de compte pour le portail, pour
	 * archive, et pour le lien avec la personne juridique (qui es-ce concrètement?)
	 * Ces deux champs ne sont pas utilisés pour l'authentification
	 */
	private String nom;
	private String prenom;
	
	/**
	 * Les membres de l'association peuvent se connecter au portail Organisaction en utilisant soit leur nom d'utilisateur, soit
	 * leur adresse email, en utilisant le même mot de passe dans les deux cas.
	 */
	private String username;
	private String email;
	private int age;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static MembreAssociationDTO getDTO(MembreAssociation from) {
		MembreAssociationDTO retour = null;
		retour = new MembreAssociationDTO();
		retour.setNom(from.getNom());
		retour.setPrenom(from.getPrenom());
		retour.setUsername(from.getUsername());
		retour.setEmail(from.getEmail());
		retour.setAge(from.getAge());
		return retour;
	}

}

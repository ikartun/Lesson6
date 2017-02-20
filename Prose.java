package by.epam.tr.lesson6;

public class Prose extends LiteratureWork {
	private boolean isRhyme;
	private String genre;
	
	public Prose(String title, int yearPublished, String author, boolean isRhyme, String genre) {
		super(title, yearPublished, author);
		this.isRhyme = isRhyme;
		this.genre = genre;
	}

	public boolean isRhyme() {
		return isRhyme;
	}

	public void setRhyme(boolean isRhyme) {
		this.isRhyme = isRhyme;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + (isRhyme ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!super.equals(obj)) {
			return false;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Prose prose = (Prose) obj;
		
		if (genre == null) {
			if (prose.genre != null) {
				return false;
			}
		} else if (!genre.equals(prose.genre)) {
			return false;
		}
		
		if (isRhyme != prose.isRhyme) {
			return false;
		}
		return true;
	}
	
	
	
	
}

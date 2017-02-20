package by.epam.tr.lesson6;

public class LiteratureWork {
	private String title;
	private int yearPublished;
	private String author;
	
	public LiteratureWork(String title, int yearPublished, String author) {
		this.title = title;
		this.yearPublished = yearPublished;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
		return result;
	}

	@Override
	public boolean equals(Object obj) {		
		if (obj == null) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		LiteratureWork literatureWork = (LiteratureWork) obj;
		
		if (author == null) {
			if (literatureWork.author != null) {
				return false;
			}
		} else if (!author.equals(literatureWork.author)) {
			return false;
		}
		
		if (title == null) {
			if (literatureWork.title != null) {
				return false;
			}
		} else if (!title.equals(literatureWork.title)) {
			return false;
		}
		if (yearPublished != literatureWork.yearPublished) {
			return false;
		}
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

package by.epam.tr.lesson6;

import java.util.List;

public class CollectedLiteratureWork {
	private List<LiteratureWork> literatureWorks;
	private String form;
	
	public CollectedLiteratureWork(List<LiteratureWork> literatureWorks, String form) {
		this.literatureWorks = literatureWorks;
		this.form = form;
	}

	public List<LiteratureWork> getLiteratureWorks() {
		return literatureWorks;
	}

	public String getForm() {
		return form;
	}
	
	public boolean isLiteratureWorkExistInCollection(LiteratureWork searchable) {
		for (LiteratureWork literatureWork : literatureWorks) {
			if (literatureWork.equals(searchable)) {
				return true;
			}
		}		
		return false;
	}
}

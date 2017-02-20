package by.epam.tr.lesson6;

import java.util.ArrayList;
import java.util.List;

public class CollectedLiteratureWorkSearch {

	public static void main(String[] args) {
		List<LiteratureWork> verseLiteratureWorks = new ArrayList<>();
		List<LiteratureWork> proseLiteratureWorks = new ArrayList<>();
		
		verseLiteratureWorks.add(new Verse("Евгений Онегин", 1831, "А.С. Пушкин", true, "роман"));
		verseLiteratureWorks.add(new Verse("Мцыри", 1839, "М.Ю. Лермонтов", true, "поэма"));
		verseLiteratureWorks.add(new Verse("Анна Снегина", 1925, "С.А. Есенин", true, "поэма"));
		verseLiteratureWorks.add(new Verse("Илиада", 562, "Гомер", true, "эпическая поэма"));		
		
		proseLiteratureWorks.add(new Prose("Мастер и Маргарита", 1937, "М.А. Булгаков", false, "роман"));
		proseLiteratureWorks.add(new Prose("Война и мир", 1860, "Л.Н. Толстой", false, "роман-эпопея"));
		proseLiteratureWorks.add(new Prose("Ревизор", 1840, "Н.В. Гоголь", false, "комедия"));
		
		CollectedLiteratureWork collectedVerses = new CollectedLiteratureWork(verseLiteratureWorks, "журнал");
		CollectedLiteratureWork collectedProses = new CollectedLiteratureWork(proseLiteratureWorks, "книга");
		
		search(collectedVerses, new Verse("Анна Снегина", 1925, "С.А. Есенин", true, "поэма"));
		search(collectedVerses, new Verse("Анна Снегина", 1930, "М.Ю. Лермонтов", true, "поэма"));
		
		search(collectedProses, new Prose("Война и мир", 1860, "Л.Н. Толстой", false, "роман-эпопея"));
		search(collectedProses, new Prose("Война и мир", 1861, "Л.Н. Толстой", true, "роман-эпопея"));			
	}
	
	public static void search(CollectedLiteratureWork collectedLiteratureWork, LiteratureWork searchable) {
		boolean result = collectedLiteratureWork.isLiteratureWorkExistInCollection(searchable);
		System.out.println(collectedLiteratureWork.getForm() + "-сборник " + (result ? "содержит" : "не содержит") + " произведение " + searchable.getTitle());
	}

}

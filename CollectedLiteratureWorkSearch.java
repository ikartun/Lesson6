package by.epam.tr.lesson6;

import java.util.ArrayList;
import java.util.List;

public class CollectedLiteratureWorkSearch {

	public static void main(String[] args) {
		List<LiteratureWork> verseLiteratureWorks = new ArrayList<>();
		List<LiteratureWork> proseLiteratureWorks = new ArrayList<>();
		
		verseLiteratureWorks.add(new Verse("������� ������", 1831, "�.�. ������", true, "�����"));
		verseLiteratureWorks.add(new Verse("�����", 1839, "�.�. ���������", true, "�����"));
		verseLiteratureWorks.add(new Verse("���� �������", 1925, "�.�. ������", true, "�����"));
		verseLiteratureWorks.add(new Verse("������", 562, "�����", true, "��������� �����"));		
		
		proseLiteratureWorks.add(new Prose("������ � ���������", 1937, "�.�. ��������", false, "�����"));
		proseLiteratureWorks.add(new Prose("����� � ���", 1860, "�.�. �������", false, "�����-������"));
		proseLiteratureWorks.add(new Prose("�������", 1840, "�.�. ������", false, "�������"));
		
		CollectedLiteratureWork collectedVerses = new CollectedLiteratureWork(verseLiteratureWorks, "������");
		CollectedLiteratureWork collectedProses = new CollectedLiteratureWork(proseLiteratureWorks, "�����");
		
		search(collectedVerses, new Verse("���� �������", 1925, "�.�. ������", true, "�����"));
		search(collectedVerses, new Verse("���� �������", 1930, "�.�. ���������", true, "�����"));
		
		search(collectedProses, new Prose("����� � ���", 1860, "�.�. �������", false, "�����-������"));
		search(collectedProses, new Prose("����� � ���", 1861, "�.�. �������", true, "�����-������"));			
	}
	
	public static void search(CollectedLiteratureWork collectedLiteratureWork, LiteratureWork searchable) {
		boolean result = collectedLiteratureWork.isLiteratureWorkExistInCollection(searchable);
		System.out.println(collectedLiteratureWork.getForm() + "-������� " + (result ? "��������" : "�� ��������") + " ������������ " + searchable.getTitle());
	}

}

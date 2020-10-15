package com.bl.assignment;

import org.junit.Test;
import org.junit.Assert;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturn_ParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> linkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null) {
				value = 1;
			} 
			else {
				value += 1;
			}
			linkedHashMap.add(word, value);
		}
		System.out.println(linkedHashMap);
		Assert.assertEquals(3, (int) linkedHashMap.get("paranoid"));
	}
	
	@Test
	public void givenAnotherSentence_WhenWordsAreAddedToList_ShouldReturnFrequency() {
		String sentence = "hello hello hii lists lists hello";
		MyLinkedHashMap<String, Integer> linkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null) {
				value = 1;
			} 
			if (value != null) {
				value += 1;
			}
			linkedHashMap.add(word, value);
		}
		System.out.println(linkedHashMap);
		Assert.assertEquals(3, (int) linkedHashMap.get("hello"));
		Assert.assertEquals(2, (int) linkedHashMap.get("lists"));
	}
}

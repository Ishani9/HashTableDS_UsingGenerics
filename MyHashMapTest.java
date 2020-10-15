package com.bl.assignment;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

public class MyHashMapTest {
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> map = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = map.get(word);
			
			if (value == null) {
				value = 1;
			} 
			else {
				value = value + 1;
			}
			
			map.add(word, value);
		}
		int frequency = map.get("to");
		int frequency2 = map.get("or");
		System.out.println(map);
		Assert.assertEquals(2, frequency);
		Assert.assertEquals(1, frequency2);
	}
	
	@Test
	public void givenADifferentSentence_WhenWordsAreAdded_ShouldReturnWordFrequency() {
		String sentence = "to to to do to do";
		MyHashMap<String, Integer> map = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = map.get(word);
			
			if (value == null) {
				value = 1;
			} 
			if (value != null) {
				value = value + 1;
			}
			
			map.add(word, value);
		}
		int frequency3 = map.get("to");
		int frequency4 = map.get("do");
		System.out.println(map);
		Assert.assertEquals(4, frequency3);
		Assert.assertEquals(2, frequency4);
	}
}

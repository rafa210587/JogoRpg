package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class MaxCharTxt extends PlainDocument {
	
	private int maxChars;
	
		public void insertString(int offs, String str, AttributeSet a)
				throws BadLocationException{
			if (str!= null && (getLength() + str.length() <= maxChars)){
				
				super.insertString(offs, str, a);
				
			}
		}
		public void setMaxChars(int maxChars){
			
			
			this.maxChars = maxChars;
			
		}
	

}

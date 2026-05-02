package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void isPalindrome_withSimpleWord_returnsTrue() {
        assertTrue(StringUtil.isPalindrome("racecar"));
    }

    @Test
    void isPalindrome_withPhrase_returnsTrue() {
        assertTrue(StringUtil.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void isPalindrome_withNonPalindrome_returnsFalse() {
        assertFalse(StringUtil.isPalindrome("hello"));
    }

    @Test
    void reverse_withNormalString_returnsReversed() {
        assertEquals("olleh", StringUtil.reverse("hello"));
    }

    @Test
    void reverse_withNull_returnsNull() {
        assertNull(StringUtil.reverse(null));
    }

    @Test
    void isNullOrEmpty_withNull_returnsTrue() {
        assertTrue(StringUtil.isNullOrEmpty(null));
    }

    @Test
    void capitalize_withLowerCase_returnsCapitalized() {
        assertEquals("Hello", StringUtil.capitalize("hello"));
    }
}
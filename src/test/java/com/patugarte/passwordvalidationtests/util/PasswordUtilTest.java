package com.patugarte.passwordvalidationtests.util;

import org.junit.Test;

import static com.patugarte.passwordvalidationtests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void assessPassword_lessThan8LettersString_WEAK() {
        assertEquals(WEAK,PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void assessPassword_lessThan8LettersWithNumbersAndSymbolsString_WEAK() {
        assertEquals(WEAK,PasswordUtil.assessPassword("4ad57!"));
    }

    @Test
    public void assesPassword_onlyLettersLargeString_WEAK() {
        assertEquals(WEAK,PasswordUtil.assessPassword("abcdefghijklmnopq"));
    }

    @Test
    public void assesPassword_lettersAndNumbersString_MEDIUM() {
        assertEquals(MEDIUM,PasswordUtil.assessPassword("1a2b3c4d5e6f7g8h9i"));
    }

    @Test
    public void assesPassword_lettersNumbersAndSymbolsString_STRONG() {
        assertEquals(STRONG,PasswordUtil.assessPassword("1a!2b!3c!4d!5e!6f!7g!8h!9i!"));
    }
}
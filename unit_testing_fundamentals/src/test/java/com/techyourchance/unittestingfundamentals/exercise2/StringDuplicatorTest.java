package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
// add these imports so you don't have to write
// Assert.assertThat and CoreMatcher.is
// it will be assertThat and is
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicating_an_empty_string_should_still_be_empty() throws Exception {
        String result = SUT.duplicate("");
        assertThat(result, is(""));
    }

    @Test
    public void duplicating_a_single_character_should_be_two_characters() throws Exception {
        String result = SUT.duplicate("D");
        assertThat(result, is("DD"));
    }

    @Test
    public void duplicating_a_string_will_make_a_copy_and_add_it_to_the_string() throws Exception {
        String result = SUT.duplicate("Dan Shrout");
        assertThat(result, is("Dan ShroutDan Shrout"));
    }

}
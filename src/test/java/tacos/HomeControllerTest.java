/**
 * ***************************************************************************
 * <p>
 * $RCSfile: HomeControllerTest.java,v $
 * <p>
 * <p>
 * <p>
 * ***************************************************************************
 * <p>
 * $Revision: 1.0 $
 * <p>
 * $Id: HomeControllerTest.java,v 2019/05/27 3:27 PM mkaroune Exp $
 * <p>
 * ***************************************************************************
 * <p>
 * Copyright (c) 2019 Nokia . All Rights Reserved.
 * Please read the associated COPYRIGHTS file for more details.
 * <p>
 * ***************************************************************************
 */

package tacos;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControllerTest
{

    @Test
    public void contextLoads()
    {
    }

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHomePage() throws Exception
    {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(
                        containsString("Welcome to...")));
    }
}

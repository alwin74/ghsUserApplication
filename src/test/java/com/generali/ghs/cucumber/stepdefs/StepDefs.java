package com.generali.ghs.cucumber.stepdefs;

import com.generali.ghs.GhsUserApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GhsUserApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

/*
 * Copyright (c) 2018 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.example.security.basic.config;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

//@Component
public class CustomSecurityFilter implements Filter
{

    @Override
    public void init(FilterConfig filterConfig)
            throws ServletException
    {
        System.out.println("Init::called");
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException,
            ServletException
    {
        HttpServletRequest servletRequest = (HttpServletRequest) request;
        Principal userPrincipal = servletRequest.getUserPrincipal();
        
      
        System.out.println("userPrinciple::"+userPrincipal);
        chain.doFilter(servletRequest, response);
    }

    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub
        
    }

}

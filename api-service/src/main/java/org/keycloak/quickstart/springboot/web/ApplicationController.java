/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.keycloak.quickstart.springboot.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String handleResourceRoot() {
        LOGGER.info("==== resource_root ====");
        return createResponse();
    }

    @RequestMapping(value = "/v1/resourcea", method = RequestMethod.GET)
    public String handleResourceA() {
        LOGGER.info("==== resourcea ====");
        return createResponse();
    }

    @RequestMapping(value = "/v1/resourceb", method = RequestMethod.GET)
    public String handleResourceB() {
        LOGGER.info("==== resourceb ====");
        return createResponse();
    }

    @RequestMapping(value = "/premium", method = RequestMethod.GET)
    public String handlePremiumResource() {
        return createResponse();
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String handleAdminResource() {
        return createResponse();
    }

    @RequestMapping(value = "/free", method = RequestMethod.GET)
    public String handleFreeResource() {
        return createResponse();
    }

    private String createResponse() {
        return "Access Granted";
    }
}

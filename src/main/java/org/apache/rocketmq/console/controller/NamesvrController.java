/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.rocketmq.console.controller;

import javax.annotation.Resource;

import org.apache.rocketmq.console.aspect.admin.annotation.OriginalControllerReturnValue;
import org.apache.rocketmq.console.service.OpsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rocketmq")
public class NamesvrController {
    @Resource
    private OpsService opsService;

    /**
     * rocket-mq注册中心链接信息
     *
     * @return
     */
    @RequestMapping(value = "/nsaddr", method = RequestMethod.GET)
    @ResponseBody
    @OriginalControllerReturnValue
    public Object nsaddr() {
        return opsService.getNameSvrList();
    }
}

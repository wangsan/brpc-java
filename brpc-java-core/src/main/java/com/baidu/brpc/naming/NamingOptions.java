/*
 * Copyright (c) 2018 Baidu, Inc. All Rights Reserved.
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
 */

package com.baidu.brpc.naming;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NamingOptions {
    /**
     * identify different service implementation for the same interface.
     */
    private String group = "normal";

    /**
     * identify service version.
     */
    private String version = "1.0.0";

    /**
     * if true, naming service will throw exception when register/subscribe exceptions.
     */
    private boolean ignoreFailOfNamingService = false;
}

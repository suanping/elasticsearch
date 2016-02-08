/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.bootstrap;

import org.elasticsearch.common.settings.Setting;
import org.elasticsearch.common.settings.Setting.Scope;

public class BootstrapSettings {

    // TODO: remove this: http://www.openbsd.org/papers/hackfest2015-pledge/mgp00005.jpg
    /**
     * option to turn off our security manager completely, for example
     * if you want to have your own configuration or just disable
     */
    public static final Setting<Boolean> SECURITY_MANAGER_ENABLED_SETTING =
            Setting.boolSetting("security.manager.enabled", true, false, Scope.CLUSTER);

    // TODO: remove this hack when insecure defaults are removed from java
    public static final Setting<Boolean> SECURITY_FILTER_BAD_DEFAULTS_SETTING =
            Setting.boolSetting("security.manager.filter_bad_defaults", true, false, Scope.CLUSTER);

    public static final Setting<Boolean> MLOCKALL_SETTING = Setting.boolSetting("bootstrap.mlockall", false, false, Scope.CLUSTER);
    public static final Setting<Boolean> SECCOMP_SETTING = Setting.boolSetting("bootstrap.seccomp", true, false, Scope.CLUSTER);
    public static final Setting<Boolean> CTRLHANDLER_SETTING = Setting.boolSetting("bootstrap.ctrlhandler", true, false, Scope.CLUSTER);

}
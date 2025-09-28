/*
 * Copyright 2024 albertzb [albertzb42@gmail.com].
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@TemplateRegistration(
        folder = "AZB Swing GUI Forms",
        iconBase="us/albertzb/templates/jframe/JFrame.png",
        displayName = "New JFrame",
        content = {"JFrame.java.template","JFrame.form.template"},
        description = "JFrame.html",
        scriptEngine="freemarker")
package us.albertzb.templates.jframe;

import org.netbeans.api.templates.TemplateRegistration;
import org.openide.util.NbBundle.Messages;
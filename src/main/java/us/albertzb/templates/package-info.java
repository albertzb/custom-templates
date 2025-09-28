/*
 * Copyright 2025 albertzb [albertzb42@gmail.com].
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
@TemplateRegistrations({
    @TemplateRegistration(
            folder = "azb Swing GUI Forms",
            iconBase = "us/albertzb/templates/jframe/JFrame.png",
            displayName = "#jframe_displayName",
            content = {"jframe/JFrame.java.template", "jframe/JFrame.form.template"},
            description = "jframe/JFrame.html",
            scriptEngine = "freemarker"),
    @TemplateRegistration(
            folder = "azb Java",
            iconBase = "us/albertzb/templates/exceptions/class.png",
            displayName = "#customException_displayName",
            content = {"exceptions/CustomException.java.template"},
            description = "exceptions/CustomException.html",
            scriptEngine = "freemarker")
})
package us.albertzb.templates;

import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.api.templates.TemplateRegistrations;

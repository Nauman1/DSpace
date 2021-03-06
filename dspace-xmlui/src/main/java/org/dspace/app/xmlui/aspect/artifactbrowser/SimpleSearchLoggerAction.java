/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.xmlui.aspect.artifactbrowser;

import org.apache.cocoon.environment.Request;
import org.apache.commons.lang.StringUtils;
import org.dspace.app.xmlui.cocoon.SearchLoggerAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Returns the query for a simple search so our SearchLoggerAction can log this
 *
 * @author Kevin Van de Velde (kevin at atmire dot com)
 * @author Ben Bosman (ben at atmire dot com)
 * @author Mark Diggory (markd at atmire dot com)
 */
public class SimpleSearchLoggerAction extends SearchLoggerAction{

    @Override
    protected List<String> getQueries(Request request) {
        String query = request.getParameter("query");
        if(!StringUtils.isBlank(query)){
            return Arrays.asList(request.getParameter("query"));
        }else{
            return new ArrayList<String>();
        }
    }
}

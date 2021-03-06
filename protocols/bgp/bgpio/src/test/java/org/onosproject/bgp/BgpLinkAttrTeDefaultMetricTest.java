/*
 * Copyright 2015 Open Networking Laboratory
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
package org.onosproject.bgp;

import org.junit.Test;
import org.onosproject.bgpio.types.attr.BgpLinkAttrTeDefaultMetric;

import com.google.common.testing.EqualsTester;

/**
 * Test for BGP link TE default metric attribute.
 */
public class BgpLinkAttrTeDefaultMetricTest {
    private final int val = 0x010203;
    private final int val1 = 0x01020304;

    private final BgpLinkAttrTeDefaultMetric data = BgpLinkAttrTeDefaultMetric
            .of(val);
    private final BgpLinkAttrTeDefaultMetric sameAsData = BgpLinkAttrTeDefaultMetric
            .of(val);
    private final BgpLinkAttrTeDefaultMetric diffData = BgpLinkAttrTeDefaultMetric
            .of(val1);

    @Test
    public void basics() {
        new EqualsTester().addEqualityGroup(data, sameAsData)
                .addEqualityGroup(diffData).testEquals();
    }
}
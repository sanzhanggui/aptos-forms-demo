// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.wubuku.aptos.bean.*;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimeRange {

    private XRenderFormTime start;

    private XRenderFormTime end;


    public XRenderFormTime getStart() {
        return start;
    }

    public void setStart(XRenderFormTime start) {
        this.start = start;
    }

    public XRenderFormTime getEnd() {
        return end;
    }

    public void setEnd(XRenderFormTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "TimeRange{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Attachment;
import com.example.pcmarketdatarest.entity.MyTeam;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = MyTeam.class)
public interface CustomMyTeam {
    Integer getId();
    String getName();
    String getOccupation();
    Attachment getAttachment();
}

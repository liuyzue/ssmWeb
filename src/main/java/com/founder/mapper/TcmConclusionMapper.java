package com.founder.mapper;

import com.founder.model.tch.TchConclusion;
import com.founder.model.tch.TcmConclusion;

import java.util.ArrayList;

public interface TcmConclusionMapper {
     ArrayList<TcmConclusion> getRecord();
     void insConclusion(TchConclusion ts);
     void updConclusion(TchConclusion ts);

}

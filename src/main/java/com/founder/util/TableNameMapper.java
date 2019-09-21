package com.founder.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.util
 * @date:2019/9/19
 * @time:0:39
 */
public class TableNameMapper {
    public static final Map<String,String> tableMap=new HashMap<String,String>() {{
        put("EhrHealthEvent","Ehr_Health_Event");
        put("MsDiseaseDiagnosisInfo","Ms_Disease_Diagnosis_Info");
        put("MsDoctorAdvice","Ms_Doctor_Advice");
        put("MsDoctorAdviceRecord","Ms_Doctor_Advice_Record");
        put("MsDrugUsage","Ms_Drug_Usage");
        put("MsExamineDetail","Ms_Examine_Detail");
        put("MsExamineEvent","Ms_Examine_Event");
        put("MsExpenseDetail","Ms_Expense_Detail");
        put("MsExpenseInfo","Ms_Expense_Info");
        put("MsInpatientInfo","Ms_Inpatient_Info");
        put("MsInpatientMedicalRecord","Ms_Inpatient_Medical_Record");
        put("MsOuthospitalSummary","Ms_Outhospital_Summary");
        put("MsOutpatientInfo","Ms_Outpatient_Info");
        put("MsOutpatientPrescription","Ms_Outpatient_Prescription");
        put("MsPaitentbedStatus","Ms_Paitentbed_Status");
        put("MsRegisterRecord","Ms_Register_Record");
        put("MsStudyEvent","Ms_Study_Event");
        put("MsSurgeryInfo","Ms_Surgery_Info");
    }};
}

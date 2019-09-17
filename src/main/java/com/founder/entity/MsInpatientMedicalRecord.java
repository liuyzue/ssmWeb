package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsInpatientMedicalRecord {

  private String id;
  private String ehrId;
  private String personId;
  private String medicalRecordNo;
  private String admissionNo;
  private String hospitalCode;
  private String hospitalName;
  private String name;
  private String age;
  private String monthAge;
  private String neonatalBirthWeight;
  private String neonatalinhosWeight;
  private String birthProvince;
  private String birthCity;
  private String birthCountry;
  private java.sql.Timestamp inhosDate;
  private String inhosMethod;
  private String inhosDeptCode;
  private String inhosDeptName;
  private String inhosRoomCode;
  private String inhosCount;
  private String inhosPatientName;
  private String inhosRescueTimes;
  private String inhosRescueSuccessTimes;
  private String inhosTreatmentResult;
  private String inhosCondition;
  private java.sql.Date inhosAllergicStartDate;
  private String inhosBloodTypeCode;
  private String inhosBloodVolume;
  private String inhosBloodVolumeCount;
  private String inhosBloodReactionFlag;
  private String inhosDays;
  private String inhosCounts;
  private String inhosAutopsyFlag;
  private String inhosTeachCaseFlag;
  private String inhosMedicalQualityCode;
  private String outhosMethod;
  private String outhosFlag;
  private String outhosPurpose;
  private java.sql.Timestamp befInhoSmuDate;
  private java.sql.Timestamp aftInhoSmuDate;
  private String medicalPayWay;
  private String medicalSettlementWayCode;
  private String personalExpenses;
  private String medicalInsuranceCostSum;
  private String otherSubsidiesCostSum;
  private String admissionTotalAmount;
  private String deptMasterSignature;
  private String directorDoctorSignature;
  private String attendingDoctorSignature;
  private String admissionDoctorSignature;
  private String primaryNurseSignature;
  private String refresherDoctorsSignature;
  private String internSignature;
  private String medicalRecordSignature;
  private String qcDoctorSignature;
  private String qcNurseSignature;
  private java.sql.Date qcDate;
  private String outhosRoom;
  private String outhosDeptName;
  private java.sql.Date outHospitalDate;
  private String isDelete;
  private String gender;
  private String marriage;
  private String injuryPosionReason;
  private String injuryDiseaseCode;
  private String injuryPathologyNo;
  private String medicalsExpense;
  private String treatmentExpense;
  private String nurseExpense;
  private String otherMedicalsExpense;
  private String pathologyDiagnosisExpense;
  private String labDiagnosisExpense;
  private String imagingDiagnosisExpense;
  private String clinicalItemExpense;
  private String nonSurgicalItemExpense;
  private String clinicalTherapyExpense;
  private String surgeryTreatmentExpense;
  private String anesthesiaExpense;
  private String surgeryExpense;
  private String rehabilitationExpense;
  private String cmTreatmentExpense;
  private String wmExpense;
  private String antibacterialExpense;
  private String proprietaryCmExpense;
  private String chmExpense;
  private String bloodExpense;
  private String albuminExpense;
  private String globulinExpense;
  private String clottingFactorExpense;
  private String cytokinesExpense;
  private String checkDmmExpense;
  private String treatmentDmmExpense;
  private String surgeryDmmExpense;
  private String otherExpense;
  private String transitionDeptCode;
  private String transitionDeptName;
  private String othercardtype;
  private String othercardno;
  private String hpSNo;
  private String nation;
  private String cureType;
  private String cpwManaType;
  private String cpwManaCode;
  private String ifChDp;
  private String ifChEqpt;
  private String ifChTech;
  private String ifDialNu;
  private String ccasediagCi;
  private String ophpdiagCi;
  private String addiagCi;
  private String operdiagCi;
  private String rcasediagCi;
  private String processStatus;
  private String isLimit;
  private java.sql.Date gatherDate;
  private String outhos15Flag;

  public MsInpatientMedicalRecord() {
  }

  public MsInpatientMedicalRecord(String id, String ehrId, String personId, String medicalRecordNo, String admissionNo, String hospitalCode, String hospitalName, String name, String age, String monthAge, String neonatalBirthWeight, String neonatalinhosWeight, String birthProvince, String birthCity, String birthCountry, Timestamp inhosDate, String inhosMethod, String inhosDeptCode, String inhosDeptName, String inhosRoomCode, String inhosCount, String inhosPatientName, String inhosRescueTimes, String inhosRescueSuccessTimes, String inhosTreatmentResult, String inhosCondition, Date inhosAllergicStartDate, String inhosBloodTypeCode, String inhosBloodVolume, String inhosBloodVolumeCount, String inhosBloodReactionFlag, String inhosDays, String inhosCounts, String inhosAutopsyFlag, String inhosTeachCaseFlag, String inhosMedicalQualityCode, String outhosMethod, String outhosFlag, String outhosPurpose, Timestamp befInhoSmuDate, Timestamp aftInhoSmuDate, String medicalPayWay, String medicalSettlementWayCode, String personalExpenses, String medicalInsuranceCostSum, String otherSubsidiesCostSum, String admissionTotalAmount, String deptMasterSignature, String directorDoctorSignature, String attendingDoctorSignature, String admissionDoctorSignature, String primaryNurseSignature, String refresherDoctorsSignature, String internSignature, String medicalRecordSignature, String qcDoctorSignature, String qcNurseSignature, Date qcDate, String outhosRoom, String outhosDeptName, Date outHospitalDate, String isDelete, String gender, String marriage, String injuryPosionReason, String injuryDiseaseCode, String injuryPathologyNo, String medicalsExpense, String treatmentExpense, String nurseExpense, String otherMedicalsExpense, String pathologyDiagnosisExpense, String labDiagnosisExpense, String imagingDiagnosisExpense, String clinicalItemExpense, String nonSurgicalItemExpense, String clinicalTherapyExpense, String surgeryTreatmentExpense, String anesthesiaExpense, String surgeryExpense, String rehabilitationExpense, String cmTreatmentExpense, String wmExpense, String antibacterialExpense, String proprietaryCmExpense, String chmExpense, String bloodExpense, String albuminExpense, String globulinExpense, String clottingFactorExpense, String cytokinesExpense, String checkDmmExpense, String treatmentDmmExpense, String surgeryDmmExpense, String otherExpense, String transitionDeptCode, String transitionDeptName, String othercardtype, String othercardno, String hpSNo, String nation, String cureType, String cpwManaType, String cpwManaCode, String ifChDp, String ifChEqpt, String ifChTech, String ifDialNu, String ccasediagCi, String ophpdiagCi, String addiagCi, String operdiagCi, String rcasediagCi, String processStatus, String isLimit, Date gatherDate, String outhos15Flag) {
    this.id = id;
    this.ehrId = ehrId;
    this.personId = personId;
    this.medicalRecordNo = medicalRecordNo;
    this.admissionNo = admissionNo;
    this.hospitalCode = hospitalCode;
    this.hospitalName = hospitalName;
    this.name = name;
    this.age = age;
    this.monthAge = monthAge;
    this.neonatalBirthWeight = neonatalBirthWeight;
    this.neonatalinhosWeight = neonatalinhosWeight;
    this.birthProvince = birthProvince;
    this.birthCity = birthCity;
    this.birthCountry = birthCountry;
    this.inhosDate = inhosDate;
    this.inhosMethod = inhosMethod;
    this.inhosDeptCode = inhosDeptCode;
    this.inhosDeptName = inhosDeptName;
    this.inhosRoomCode = inhosRoomCode;
    this.inhosCount = inhosCount;
    this.inhosPatientName = inhosPatientName;
    this.inhosRescueTimes = inhosRescueTimes;
    this.inhosRescueSuccessTimes = inhosRescueSuccessTimes;
    this.inhosTreatmentResult = inhosTreatmentResult;
    this.inhosCondition = inhosCondition;
    this.inhosAllergicStartDate = inhosAllergicStartDate;
    this.inhosBloodTypeCode = inhosBloodTypeCode;
    this.inhosBloodVolume = inhosBloodVolume;
    this.inhosBloodVolumeCount = inhosBloodVolumeCount;
    this.inhosBloodReactionFlag = inhosBloodReactionFlag;
    this.inhosDays = inhosDays;
    this.inhosCounts = inhosCounts;
    this.inhosAutopsyFlag = inhosAutopsyFlag;
    this.inhosTeachCaseFlag = inhosTeachCaseFlag;
    this.inhosMedicalQualityCode = inhosMedicalQualityCode;
    this.outhosMethod = outhosMethod;
    this.outhosFlag = outhosFlag;
    this.outhosPurpose = outhosPurpose;
    this.befInhoSmuDate = befInhoSmuDate;
    this.aftInhoSmuDate = aftInhoSmuDate;
    this.medicalPayWay = medicalPayWay;
    this.medicalSettlementWayCode = medicalSettlementWayCode;
    this.personalExpenses = personalExpenses;
    this.medicalInsuranceCostSum = medicalInsuranceCostSum;
    this.otherSubsidiesCostSum = otherSubsidiesCostSum;
    this.admissionTotalAmount = admissionTotalAmount;
    this.deptMasterSignature = deptMasterSignature;
    this.directorDoctorSignature = directorDoctorSignature;
    this.attendingDoctorSignature = attendingDoctorSignature;
    this.admissionDoctorSignature = admissionDoctorSignature;
    this.primaryNurseSignature = primaryNurseSignature;
    this.refresherDoctorsSignature = refresherDoctorsSignature;
    this.internSignature = internSignature;
    this.medicalRecordSignature = medicalRecordSignature;
    this.qcDoctorSignature = qcDoctorSignature;
    this.qcNurseSignature = qcNurseSignature;
    this.qcDate = qcDate;
    this.outhosRoom = outhosRoom;
    this.outhosDeptName = outhosDeptName;
    this.outHospitalDate = outHospitalDate;
    this.isDelete = isDelete;
    this.gender = gender;
    this.marriage = marriage;
    this.injuryPosionReason = injuryPosionReason;
    this.injuryDiseaseCode = injuryDiseaseCode;
    this.injuryPathologyNo = injuryPathologyNo;
    this.medicalsExpense = medicalsExpense;
    this.treatmentExpense = treatmentExpense;
    this.nurseExpense = nurseExpense;
    this.otherMedicalsExpense = otherMedicalsExpense;
    this.pathologyDiagnosisExpense = pathologyDiagnosisExpense;
    this.labDiagnosisExpense = labDiagnosisExpense;
    this.imagingDiagnosisExpense = imagingDiagnosisExpense;
    this.clinicalItemExpense = clinicalItemExpense;
    this.nonSurgicalItemExpense = nonSurgicalItemExpense;
    this.clinicalTherapyExpense = clinicalTherapyExpense;
    this.surgeryTreatmentExpense = surgeryTreatmentExpense;
    this.anesthesiaExpense = anesthesiaExpense;
    this.surgeryExpense = surgeryExpense;
    this.rehabilitationExpense = rehabilitationExpense;
    this.cmTreatmentExpense = cmTreatmentExpense;
    this.wmExpense = wmExpense;
    this.antibacterialExpense = antibacterialExpense;
    this.proprietaryCmExpense = proprietaryCmExpense;
    this.chmExpense = chmExpense;
    this.bloodExpense = bloodExpense;
    this.albuminExpense = albuminExpense;
    this.globulinExpense = globulinExpense;
    this.clottingFactorExpense = clottingFactorExpense;
    this.cytokinesExpense = cytokinesExpense;
    this.checkDmmExpense = checkDmmExpense;
    this.treatmentDmmExpense = treatmentDmmExpense;
    this.surgeryDmmExpense = surgeryDmmExpense;
    this.otherExpense = otherExpense;
    this.transitionDeptCode = transitionDeptCode;
    this.transitionDeptName = transitionDeptName;
    this.othercardtype = othercardtype;
    this.othercardno = othercardno;
    this.hpSNo = hpSNo;
    this.nation = nation;
    this.cureType = cureType;
    this.cpwManaType = cpwManaType;
    this.cpwManaCode = cpwManaCode;
    this.ifChDp = ifChDp;
    this.ifChEqpt = ifChEqpt;
    this.ifChTech = ifChTech;
    this.ifDialNu = ifDialNu;
    this.ccasediagCi = ccasediagCi;
    this.ophpdiagCi = ophpdiagCi;
    this.addiagCi = addiagCi;
    this.operdiagCi = operdiagCi;
    this.rcasediagCi = rcasediagCi;
    this.processStatus = processStatus;
    this.isLimit = isLimit;
    this.gatherDate = gatherDate;
    this.outhos15Flag = outhos15Flag;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getEhrId() {
    return ehrId;
  }

  public void setEhrId(String ehrId) {
    this.ehrId = ehrId;
  }


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }


  public String getMedicalRecordNo() {
    return medicalRecordNo;
  }

  public void setMedicalRecordNo(String medicalRecordNo) {
    this.medicalRecordNo = medicalRecordNo;
  }


  public String getAdmissionNo() {
    return admissionNo;
  }

  public void setAdmissionNo(String admissionNo) {
    this.admissionNo = admissionNo;
  }


  public String getHospitalCode() {
    return hospitalCode;
  }

  public void setHospitalCode(String hospitalCode) {
    this.hospitalCode = hospitalCode;
  }


  public String getHospitalName() {
    return hospitalName;
  }

  public void setHospitalName(String hospitalName) {
    this.hospitalName = hospitalName;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }


  public String getMonthAge() {
    return monthAge;
  }

  public void setMonthAge(String monthAge) {
    this.monthAge = monthAge;
  }


  public String getNeonatalBirthWeight() {
    return neonatalBirthWeight;
  }

  public void setNeonatalBirthWeight(String neonatalBirthWeight) {
    this.neonatalBirthWeight = neonatalBirthWeight;
  }


  public String getNeonatalinhosWeight() {
    return neonatalinhosWeight;
  }

  public void setNeonatalinhosWeight(String neonatalinhosWeight) {
    this.neonatalinhosWeight = neonatalinhosWeight;
  }


  public String getBirthProvince() {
    return birthProvince;
  }

  public void setBirthProvince(String birthProvince) {
    this.birthProvince = birthProvince;
  }


  public String getBirthCity() {
    return birthCity;
  }

  public void setBirthCity(String birthCity) {
    this.birthCity = birthCity;
  }


  public String getBirthCountry() {
    return birthCountry;
  }

  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }


  public java.sql.Timestamp getInhosDate() {
    return inhosDate;
  }

  public void setInhosDate(java.sql.Timestamp inhosDate) {
    this.inhosDate = inhosDate;
  }


  public String getInhosMethod() {
    return inhosMethod;
  }

  public void setInhosMethod(String inhosMethod) {
    this.inhosMethod = inhosMethod;
  }


  public String getInhosDeptCode() {
    return inhosDeptCode;
  }

  public void setInhosDeptCode(String inhosDeptCode) {
    this.inhosDeptCode = inhosDeptCode;
  }


  public String getInhosDeptName() {
    return inhosDeptName;
  }

  public void setInhosDeptName(String inhosDeptName) {
    this.inhosDeptName = inhosDeptName;
  }


  public String getInhosRoomCode() {
    return inhosRoomCode;
  }

  public void setInhosRoomCode(String inhosRoomCode) {
    this.inhosRoomCode = inhosRoomCode;
  }


  public String getInhosCount() {
    return inhosCount;
  }

  public void setInhosCount(String inhosCount) {
    this.inhosCount = inhosCount;
  }


  public String getInhosPatientName() {
    return inhosPatientName;
  }

  public void setInhosPatientName(String inhosPatientName) {
    this.inhosPatientName = inhosPatientName;
  }


  public String getInhosRescueTimes() {
    return inhosRescueTimes;
  }

  public void setInhosRescueTimes(String inhosRescueTimes) {
    this.inhosRescueTimes = inhosRescueTimes;
  }


  public String getInhosRescueSuccessTimes() {
    return inhosRescueSuccessTimes;
  }

  public void setInhosRescueSuccessTimes(String inhosRescueSuccessTimes) {
    this.inhosRescueSuccessTimes = inhosRescueSuccessTimes;
  }


  public String getInhosTreatmentResult() {
    return inhosTreatmentResult;
  }

  public void setInhosTreatmentResult(String inhosTreatmentResult) {
    this.inhosTreatmentResult = inhosTreatmentResult;
  }


  public String getInhosCondition() {
    return inhosCondition;
  }

  public void setInhosCondition(String inhosCondition) {
    this.inhosCondition = inhosCondition;
  }


  public java.sql.Date getInhosAllergicStartDate() {
    return inhosAllergicStartDate;
  }

  public void setInhosAllergicStartDate(java.sql.Date inhosAllergicStartDate) {
    this.inhosAllergicStartDate = inhosAllergicStartDate;
  }


  public String getInhosBloodTypeCode() {
    return inhosBloodTypeCode;
  }

  public void setInhosBloodTypeCode(String inhosBloodTypeCode) {
    this.inhosBloodTypeCode = inhosBloodTypeCode;
  }


  public String getInhosBloodVolume() {
    return inhosBloodVolume;
  }

  public void setInhosBloodVolume(String inhosBloodVolume) {
    this.inhosBloodVolume = inhosBloodVolume;
  }


  public String getInhosBloodVolumeCount() {
    return inhosBloodVolumeCount;
  }

  public void setInhosBloodVolumeCount(String inhosBloodVolumeCount) {
    this.inhosBloodVolumeCount = inhosBloodVolumeCount;
  }


  public String getInhosBloodReactionFlag() {
    return inhosBloodReactionFlag;
  }

  public void setInhosBloodReactionFlag(String inhosBloodReactionFlag) {
    this.inhosBloodReactionFlag = inhosBloodReactionFlag;
  }


  public String getInhosDays() {
    return inhosDays;
  }

  public void setInhosDays(String inhosDays) {
    this.inhosDays = inhosDays;
  }


  public String getInhosCounts() {
    return inhosCounts;
  }

  public void setInhosCounts(String inhosCounts) {
    this.inhosCounts = inhosCounts;
  }


  public String getInhosAutopsyFlag() {
    return inhosAutopsyFlag;
  }

  public void setInhosAutopsyFlag(String inhosAutopsyFlag) {
    this.inhosAutopsyFlag = inhosAutopsyFlag;
  }


  public String getInhosTeachCaseFlag() {
    return inhosTeachCaseFlag;
  }

  public void setInhosTeachCaseFlag(String inhosTeachCaseFlag) {
    this.inhosTeachCaseFlag = inhosTeachCaseFlag;
  }


  public String getInhosMedicalQualityCode() {
    return inhosMedicalQualityCode;
  }

  public void setInhosMedicalQualityCode(String inhosMedicalQualityCode) {
    this.inhosMedicalQualityCode = inhosMedicalQualityCode;
  }


  public String getOuthosMethod() {
    return outhosMethod;
  }

  public void setOuthosMethod(String outhosMethod) {
    this.outhosMethod = outhosMethod;
  }


  public String getOuthosFlag() {
    return outhosFlag;
  }

  public void setOuthosFlag(String outhosFlag) {
    this.outhosFlag = outhosFlag;
  }


  public String getOuthosPurpose() {
    return outhosPurpose;
  }

  public void setOuthosPurpose(String outhosPurpose) {
    this.outhosPurpose = outhosPurpose;
  }


  public java.sql.Timestamp getBefInhoSmuDate() {
    return befInhoSmuDate;
  }

  public void setBefInhoSmuDate(java.sql.Timestamp befInhoSmuDate) {
    this.befInhoSmuDate = befInhoSmuDate;
  }


  public java.sql.Timestamp getAftInhoSmuDate() {
    return aftInhoSmuDate;
  }

  public void setAftInhoSmuDate(java.sql.Timestamp aftInhoSmuDate) {
    this.aftInhoSmuDate = aftInhoSmuDate;
  }


  public String getMedicalPayWay() {
    return medicalPayWay;
  }

  public void setMedicalPayWay(String medicalPayWay) {
    this.medicalPayWay = medicalPayWay;
  }


  public String getMedicalSettlementWayCode() {
    return medicalSettlementWayCode;
  }

  public void setMedicalSettlementWayCode(String medicalSettlementWayCode) {
    this.medicalSettlementWayCode = medicalSettlementWayCode;
  }


  public String getPersonalExpenses() {
    return personalExpenses;
  }

  public void setPersonalExpenses(String personalExpenses) {
    this.personalExpenses = personalExpenses;
  }


  public String getMedicalInsuranceCostSum() {
    return medicalInsuranceCostSum;
  }

  public void setMedicalInsuranceCostSum(String medicalInsuranceCostSum) {
    this.medicalInsuranceCostSum = medicalInsuranceCostSum;
  }


  public String getOtherSubsidiesCostSum() {
    return otherSubsidiesCostSum;
  }

  public void setOtherSubsidiesCostSum(String otherSubsidiesCostSum) {
    this.otherSubsidiesCostSum = otherSubsidiesCostSum;
  }


  public String getAdmissionTotalAmount() {
    return admissionTotalAmount;
  }

  public void setAdmissionTotalAmount(String admissionTotalAmount) {
    this.admissionTotalAmount = admissionTotalAmount;
  }


  public String getDeptMasterSignature() {
    return deptMasterSignature;
  }

  public void setDeptMasterSignature(String deptMasterSignature) {
    this.deptMasterSignature = deptMasterSignature;
  }


  public String getDirectorDoctorSignature() {
    return directorDoctorSignature;
  }

  public void setDirectorDoctorSignature(String directorDoctorSignature) {
    this.directorDoctorSignature = directorDoctorSignature;
  }


  public String getAttendingDoctorSignature() {
    return attendingDoctorSignature;
  }

  public void setAttendingDoctorSignature(String attendingDoctorSignature) {
    this.attendingDoctorSignature = attendingDoctorSignature;
  }


  public String getAdmissionDoctorSignature() {
    return admissionDoctorSignature;
  }

  public void setAdmissionDoctorSignature(String admissionDoctorSignature) {
    this.admissionDoctorSignature = admissionDoctorSignature;
  }


  public String getPrimaryNurseSignature() {
    return primaryNurseSignature;
  }

  public void setPrimaryNurseSignature(String primaryNurseSignature) {
    this.primaryNurseSignature = primaryNurseSignature;
  }


  public String getRefresherDoctorsSignature() {
    return refresherDoctorsSignature;
  }

  public void setRefresherDoctorsSignature(String refresherDoctorsSignature) {
    this.refresherDoctorsSignature = refresherDoctorsSignature;
  }


  public String getInternSignature() {
    return internSignature;
  }

  public void setInternSignature(String internSignature) {
    this.internSignature = internSignature;
  }


  public String getMedicalRecordSignature() {
    return medicalRecordSignature;
  }

  public void setMedicalRecordSignature(String medicalRecordSignature) {
    this.medicalRecordSignature = medicalRecordSignature;
  }


  public String getQcDoctorSignature() {
    return qcDoctorSignature;
  }

  public void setQcDoctorSignature(String qcDoctorSignature) {
    this.qcDoctorSignature = qcDoctorSignature;
  }


  public String getQcNurseSignature() {
    return qcNurseSignature;
  }

  public void setQcNurseSignature(String qcNurseSignature) {
    this.qcNurseSignature = qcNurseSignature;
  }


  public java.sql.Date getQcDate() {
    return qcDate;
  }

  public void setQcDate(java.sql.Date qcDate) {
    this.qcDate = qcDate;
  }


  public String getOuthosRoom() {
    return outhosRoom;
  }

  public void setOuthosRoom(String outhosRoom) {
    this.outhosRoom = outhosRoom;
  }


  public String getOuthosDeptName() {
    return outhosDeptName;
  }

  public void setOuthosDeptName(String outhosDeptName) {
    this.outhosDeptName = outhosDeptName;
  }


  public java.sql.Date getOutHospitalDate() {
    return outHospitalDate;
  }

  public void setOutHospitalDate(java.sql.Date outHospitalDate) {
    this.outHospitalDate = outHospitalDate;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
  }


  public String getInjuryPosionReason() {
    return injuryPosionReason;
  }

  public void setInjuryPosionReason(String injuryPosionReason) {
    this.injuryPosionReason = injuryPosionReason;
  }


  public String getInjuryDiseaseCode() {
    return injuryDiseaseCode;
  }

  public void setInjuryDiseaseCode(String injuryDiseaseCode) {
    this.injuryDiseaseCode = injuryDiseaseCode;
  }


  public String getInjuryPathologyNo() {
    return injuryPathologyNo;
  }

  public void setInjuryPathologyNo(String injuryPathologyNo) {
    this.injuryPathologyNo = injuryPathologyNo;
  }


  public String getMedicalsExpense() {
    return medicalsExpense;
  }

  public void setMedicalsExpense(String medicalsExpense) {
    this.medicalsExpense = medicalsExpense;
  }


  public String getTreatmentExpense() {
    return treatmentExpense;
  }

  public void setTreatmentExpense(String treatmentExpense) {
    this.treatmentExpense = treatmentExpense;
  }


  public String getNurseExpense() {
    return nurseExpense;
  }

  public void setNurseExpense(String nurseExpense) {
    this.nurseExpense = nurseExpense;
  }


  public String getOtherMedicalsExpense() {
    return otherMedicalsExpense;
  }

  public void setOtherMedicalsExpense(String otherMedicalsExpense) {
    this.otherMedicalsExpense = otherMedicalsExpense;
  }


  public String getPathologyDiagnosisExpense() {
    return pathologyDiagnosisExpense;
  }

  public void setPathologyDiagnosisExpense(String pathologyDiagnosisExpense) {
    this.pathologyDiagnosisExpense = pathologyDiagnosisExpense;
  }


  public String getLabDiagnosisExpense() {
    return labDiagnosisExpense;
  }

  public void setLabDiagnosisExpense(String labDiagnosisExpense) {
    this.labDiagnosisExpense = labDiagnosisExpense;
  }


  public String getImagingDiagnosisExpense() {
    return imagingDiagnosisExpense;
  }

  public void setImagingDiagnosisExpense(String imagingDiagnosisExpense) {
    this.imagingDiagnosisExpense = imagingDiagnosisExpense;
  }


  public String getClinicalItemExpense() {
    return clinicalItemExpense;
  }

  public void setClinicalItemExpense(String clinicalItemExpense) {
    this.clinicalItemExpense = clinicalItemExpense;
  }


  public String getNonSurgicalItemExpense() {
    return nonSurgicalItemExpense;
  }

  public void setNonSurgicalItemExpense(String nonSurgicalItemExpense) {
    this.nonSurgicalItemExpense = nonSurgicalItemExpense;
  }


  public String getClinicalTherapyExpense() {
    return clinicalTherapyExpense;
  }

  public void setClinicalTherapyExpense(String clinicalTherapyExpense) {
    this.clinicalTherapyExpense = clinicalTherapyExpense;
  }


  public String getSurgeryTreatmentExpense() {
    return surgeryTreatmentExpense;
  }

  public void setSurgeryTreatmentExpense(String surgeryTreatmentExpense) {
    this.surgeryTreatmentExpense = surgeryTreatmentExpense;
  }


  public String getAnesthesiaExpense() {
    return anesthesiaExpense;
  }

  public void setAnesthesiaExpense(String anesthesiaExpense) {
    this.anesthesiaExpense = anesthesiaExpense;
  }


  public String getSurgeryExpense() {
    return surgeryExpense;
  }

  public void setSurgeryExpense(String surgeryExpense) {
    this.surgeryExpense = surgeryExpense;
  }


  public String getRehabilitationExpense() {
    return rehabilitationExpense;
  }

  public void setRehabilitationExpense(String rehabilitationExpense) {
    this.rehabilitationExpense = rehabilitationExpense;
  }


  public String getCmTreatmentExpense() {
    return cmTreatmentExpense;
  }

  public void setCmTreatmentExpense(String cmTreatmentExpense) {
    this.cmTreatmentExpense = cmTreatmentExpense;
  }


  public String getWmExpense() {
    return wmExpense;
  }

  public void setWmExpense(String wmExpense) {
    this.wmExpense = wmExpense;
  }


  public String getAntibacterialExpense() {
    return antibacterialExpense;
  }

  public void setAntibacterialExpense(String antibacterialExpense) {
    this.antibacterialExpense = antibacterialExpense;
  }


  public String getProprietaryCmExpense() {
    return proprietaryCmExpense;
  }

  public void setProprietaryCmExpense(String proprietaryCmExpense) {
    this.proprietaryCmExpense = proprietaryCmExpense;
  }


  public String getChmExpense() {
    return chmExpense;
  }

  public void setChmExpense(String chmExpense) {
    this.chmExpense = chmExpense;
  }


  public String getBloodExpense() {
    return bloodExpense;
  }

  public void setBloodExpense(String bloodExpense) {
    this.bloodExpense = bloodExpense;
  }


  public String getAlbuminExpense() {
    return albuminExpense;
  }

  public void setAlbuminExpense(String albuminExpense) {
    this.albuminExpense = albuminExpense;
  }


  public String getGlobulinExpense() {
    return globulinExpense;
  }

  public void setGlobulinExpense(String globulinExpense) {
    this.globulinExpense = globulinExpense;
  }


  public String getClottingFactorExpense() {
    return clottingFactorExpense;
  }

  public void setClottingFactorExpense(String clottingFactorExpense) {
    this.clottingFactorExpense = clottingFactorExpense;
  }


  public String getCytokinesExpense() {
    return cytokinesExpense;
  }

  public void setCytokinesExpense(String cytokinesExpense) {
    this.cytokinesExpense = cytokinesExpense;
  }


  public String getCheckDmmExpense() {
    return checkDmmExpense;
  }

  public void setCheckDmmExpense(String checkDmmExpense) {
    this.checkDmmExpense = checkDmmExpense;
  }


  public String getTreatmentDmmExpense() {
    return treatmentDmmExpense;
  }

  public void setTreatmentDmmExpense(String treatmentDmmExpense) {
    this.treatmentDmmExpense = treatmentDmmExpense;
  }


  public String getSurgeryDmmExpense() {
    return surgeryDmmExpense;
  }

  public void setSurgeryDmmExpense(String surgeryDmmExpense) {
    this.surgeryDmmExpense = surgeryDmmExpense;
  }


  public String getOtherExpense() {
    return otherExpense;
  }

  public void setOtherExpense(String otherExpense) {
    this.otherExpense = otherExpense;
  }


  public String getTransitionDeptCode() {
    return transitionDeptCode;
  }

  public void setTransitionDeptCode(String transitionDeptCode) {
    this.transitionDeptCode = transitionDeptCode;
  }


  public String getTransitionDeptName() {
    return transitionDeptName;
  }

  public void setTransitionDeptName(String transitionDeptName) {
    this.transitionDeptName = transitionDeptName;
  }


  public String getOthercardtype() {
    return othercardtype;
  }

  public void setOthercardtype(String othercardtype) {
    this.othercardtype = othercardtype;
  }


  public String getOthercardno() {
    return othercardno;
  }

  public void setOthercardno(String othercardno) {
    this.othercardno = othercardno;
  }


  public String getHpSNo() {
    return hpSNo;
  }

  public void setHpSNo(String hpSNo) {
    this.hpSNo = hpSNo;
  }


  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }


  public String getCureType() {
    return cureType;
  }

  public void setCureType(String cureType) {
    this.cureType = cureType;
  }


  public String getCpwManaType() {
    return cpwManaType;
  }

  public void setCpwManaType(String cpwManaType) {
    this.cpwManaType = cpwManaType;
  }


  public String getCpwManaCode() {
    return cpwManaCode;
  }

  public void setCpwManaCode(String cpwManaCode) {
    this.cpwManaCode = cpwManaCode;
  }


  public String getIfChDp() {
    return ifChDp;
  }

  public void setIfChDp(String ifChDp) {
    this.ifChDp = ifChDp;
  }


  public String getIfChEqpt() {
    return ifChEqpt;
  }

  public void setIfChEqpt(String ifChEqpt) {
    this.ifChEqpt = ifChEqpt;
  }


  public String getIfChTech() {
    return ifChTech;
  }

  public void setIfChTech(String ifChTech) {
    this.ifChTech = ifChTech;
  }


  public String getIfDialNu() {
    return ifDialNu;
  }

  public void setIfDialNu(String ifDialNu) {
    this.ifDialNu = ifDialNu;
  }


  public String getCcasediagCi() {
    return ccasediagCi;
  }

  public void setCcasediagCi(String ccasediagCi) {
    this.ccasediagCi = ccasediagCi;
  }


  public String getOphpdiagCi() {
    return ophpdiagCi;
  }

  public void setOphpdiagCi(String ophpdiagCi) {
    this.ophpdiagCi = ophpdiagCi;
  }


  public String getAddiagCi() {
    return addiagCi;
  }

  public void setAddiagCi(String addiagCi) {
    this.addiagCi = addiagCi;
  }


  public String getOperdiagCi() {
    return operdiagCi;
  }

  public void setOperdiagCi(String operdiagCi) {
    this.operdiagCi = operdiagCi;
  }


  public String getRcasediagCi() {
    return rcasediagCi;
  }

  public void setRcasediagCi(String rcasediagCi) {
    this.rcasediagCi = rcasediagCi;
  }


  public String getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(String processStatus) {
    this.processStatus = processStatus;
  }


  public String getIsLimit() {
    return isLimit;
  }

  public void setIsLimit(String isLimit) {
    this.isLimit = isLimit;
  }


  public java.sql.Date getGatherDate() {
    return gatherDate;
  }

  public void setGatherDate(java.sql.Date gatherDate) {
    this.gatherDate = gatherDate;
  }


  public String getOuthos15Flag() {
    return outhos15Flag;
  }

  public void setOuthos15Flag(String outhos15Flag) {
    this.outhos15Flag = outhos15Flag;
  }

}

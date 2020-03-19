insert into PATIENT (ID, USERNAME, PASSWORD, NAME, WEIGHT, HEIGHT, AGE) values (PATIENT_SEQ.NEXTVAL, 'pedro01', 'password', 'Peter', '75kg', '170cm', 38);
insert into MEDICATION (ID, NAME, DOSAGE, CONDITION, TIMESAWEEK, TIMESADAY, TIMETOTAKE, QUANTITY, PILLSLEFT, REFILL) values (MEDICATION_SEQ.NEXTVAL, 'Paracetamol', '250mg', 'Sore Head', 1, 4, parsedatetime('17 Mar 2012 09:00', 'dd MMM yyyy hh:mm'), 2, 54, 0); 
insert into MEDICATION (ID, NAME, DOSAGE, CONDITION, TIMESAWEEK, TIMESADAY, TIMETOTAKE, QUANTITY, PILLSLEFT, REFILL) values (MEDICATION_SEQ.NEXTVAL, 'Amlodipine', '10mg', 'High Blood Pressure', 7, 1, parsedatetime('17 Mar 2012 09:00', 'dd MMM yyyy hh:mm'), 1, 29, 0);
insert into MEDICATION (ID, NAME, DOSAGE, CONDITION, TIMESAWEEK, TIMESADAY, TIMETOTAKE, QUANTITY, PILLSLEFT, REFILL) values (MEDICATION_SEQ.NEXTVAL, 'Candesartan', '8mg', 'High Blood Pressure', 7, 1, parsedatetime('17 Mar 2012 09:00', 'dd MMM yyyy hh:mm'), 1, 29, 0);
insert into PATIENT_MEDICATION (MEDICATION_ID, PATIENT_ID) values (1, 1)
insert into PATIENT_MEDICATION (MEDICATION_ID, PATIENT_ID) values (2, 1)
insert into PATIENT_MEDICATION (MEDICATION_ID, PATIENT_ID) values (3, 1)

insert into PATIENT (ID, USERNAME, PASSWORD, NAME, WEIGHT, HEIGHT, AGE) values (PATIENT_SEQ.NEXTVAL, 'robbo02', 'password1', 'Joe', '80kg', '180cm', 40);
insert into MEDICATION (ID, NAME, DOSAGE, CONDITION, TIMESAWEEK, TIMESADAY, TIMETOTAKE, QUANTITY, PILLSLEFT, REFILL) values (MEDICATION_SEQ.NEXTVAL, 'Cholecalciferol', '800units', 'Calcium D Deficiency', 7, 1, parsedatetime('17 Mar 2012 09:00', 'dd MMM yyyy hh:mm'), 2, 28, 0);
insert into MEDICATION (ID, NAME, DOSAGE, CONDITION, TIMESAWEEK, TIMESADAY, TIMETOTAKE, QUANTITY, PILLSLEFT, REFILL) values (MEDICATION_SEQ.NEXTVAL, 'Mirtazapine', '30mg', 'Depression', 7, 1, parsedatetime('17 Mar 2012 09:00', 'dd MMM yyyy hh:mm'), 2, 28, 0);
insert into MEDICATION (ID, NAME, DOSAGE, CONDITION, TIMESAWEEK, TIMESADAY, TIMETOTAKE, QUANTITY, PILLSLEFT, REFILL) values (MEDICATION_SEQ.NEXTVAL, 'Trientine', '300mg', 'Wilsons Disease', 7, 2, parsedatetime('17 Mar 2012 09:00', 'dd MMM yyyy hh:mm'), 4, 96, 0);
insert into PATIENT_MEDICATION (MEDICATION_ID, PATIENT_ID) values (4, 2)
insert into PATIENT_MEDICATION (MEDICATION_ID, PATIENT_ID) values (5, 2)
insert into PATIENT_MEDICATION (MEDICATION_ID, PATIENT_ID) values (6, 2)



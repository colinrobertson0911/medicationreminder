insert into MEDICATION (MEDICATIONID, NAME, DOSAGE, CONDITION, TIMESAWEEK, TIMESADAY, TIMETOTAKE, QUANTITY, PILLSLEFT, REFILL) values (MEDICATION_SEQ.NEXTVAL, 'Paracetamol', 250, 'Sore Head', 1, 4, parsedatetime('10 Mar 2020 09:00', 'dd MMM yyyy hh:mm'), 2, 54,0); 

insert into PATIENT (PATIENTID, USERNAME, PASSWORD, NAME, WEIGHT, HEIGHT, AGE) values (PATIENT_SEQ.NEXTVAL, 'pedro', 'password', 'Peter', '75kg', '170cm', 38);
package edu.gemini;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class OCS implements GeminiAPI {
    @Override
    public ArrayList<AbstractSciencePlan> getAllSciencePlans() {
        return null;
    }

    @Override
    public AbstractSciencePlan getSciencePlanByNo(int planNo) {
        return null;
    }

    @Override
    public String createSciencePlan(AbstractSciencePlan sp) {
        return null;
    }

    @Override
    public String submitSciencePlan(AbstractSciencePlan sp) {
        return null;
    }

    @Override
    public boolean updateSciencePlanStatus(int planno, AbstractSciencePlan.STATUS stssp) {
        return false;
    }

    @Override
    public String testSciencePlan(AbstractSciencePlan sp) {
        return null;
    }

    @Override
    public void deleteAllSciencePlans() {

    }

    @Override
    public boolean deleteSciencePlanByNo(int planNo) {
        return false;
    }

    @Override
    public String addUnavailableDate(Date datevalue) {
        return null;
    }

    @Override
    public String deleteUnavailableDate(Date datevalue) {
        return null;
    }

    @Override
    public ArrayList<Date> getAllObservationSchedule() {
        return null;
    }

    @Override
    public AbstractAstronomicalData getAstronomicalData(AbstractSciencePlan sp) throws IOException {
        return null;
    }

    @Override
    public AbstractAstronomicalData removeAstronomicalData(AbstractSciencePlan sp, int index) throws IOException {
        return null;
    }

    @Override
    public String accessTelescopeLiveView() throws IOException {
        return null;
    }

    @Override
    public String executeCommand(String command) {
        return null;
    }

    @Override
    public String getConfigurations() {
        return null;
    }

    @Override
    public boolean addConfiguration(String confFilePath) {
        return false;
    }

    @Override
    public boolean removeConfiguration(int confNo) {
        return false;
    }

    @Override
    public AbstractObservingProgramConfigs.FoldMirrorType[] getFoldMirrorTypes() {
        return new AbstractObservingProgramConfigs.FoldMirrorType[0];
    }

    @Override
    public AbstractObservingProgramConfigs.CalibrationUnit[] getCalibrationUnits() {
        return new AbstractObservingProgramConfigs.CalibrationUnit[0];
    }

    @Override
    public AbstractObservingProgramConfigs.LightType[] getLightTypes() {
        return new AbstractObservingProgramConfigs.LightType[0];
    }

    @Override
    public AbstractObservingProgram createObservingProgram(AbstractSciencePlan sp, String opticsPrimary, double fStop, double opticsSecondaryRMS, double scienceFoldMirrorDegree, AbstractObservingProgramConfigs.FoldMirrorType scienceFoldMirrorType, int moduleContent, AbstractObservingProgramConfigs.CalibrationUnit calibrationUnit, AbstractObservingProgramConfigs.LightType lightType, AbstractTelePositionPair[] telePositionPair) {
        return null;
    }

    @Override
    public boolean saveObservingProgram(AbstractObservingProgram op) {
        return false;
    }

    @Override
    public AbstractObservingProgram getObservingProgramBySciencePlan(AbstractSciencePlan sp) {
        return null;
    }

    @Override
    public void getDefaultConfiguration() throws IOException {

    }

    @Override
    public void getCurrentConfiguration() throws IOException {

    }

    @Override
    public String updateConfiguration() throws FileNotFoundException {
        return null;
    }
}

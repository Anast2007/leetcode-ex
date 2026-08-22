class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAngle = hour * 30 + minutes * 0.5;
        double minutesAngle = minutes * 6;
        double Angle = Math.abs(hourAngle - minutesAngle);
        return Math.min(Angle, 360 - Angle);
    }
}
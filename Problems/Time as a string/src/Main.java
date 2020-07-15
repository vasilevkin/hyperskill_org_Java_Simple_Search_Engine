class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (hours < 10) {
            sb.append("0" + hours);
        } else {
            sb.append(hours);
        }

        sb.append(":");

        if (minutes < 10) {
            sb.append("0" + minutes);
        } else {
            sb.append(minutes);
        }

        sb.append(":");

        if (seconds < 10) {
            sb.append("0" + seconds);
        } else {
            sb.append(seconds);
        }

        return sb.toString();
    }
}

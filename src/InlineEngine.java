class InlineEngine extends Engine {
    private Boolean isInverted;

    public InlineEngine(int pistons, String shape, Boolean isInverted) {
        super(pistons, shape);
        this.isInverted = isInverted;
    }

    public Boolean getIsInverted() {
        return isInverted;
    }
}
package entity;

import java.util.Objects;

public class GraphicsCard extends Device {

    private int graphicMemory;
    private int graphicMemoryBus;
    private int bandwidth;

    public GraphicsCard() {

    }

    public GraphicsCard(String id, String name, double price, String manufacturer, int graphicMemory, int graphicMemoryBus, int bandwidth, Details details) {
        super(id, name, price, manufacturer, details);
        this.graphicMemory = graphicMemory;
        this.graphicMemoryBus = graphicMemoryBus;
        this.bandwidth = bandwidth;
    }

    public int getGraphicMemory() {
        return graphicMemory;
    }

    public void setGraphicMemory(int graphicMemory) {
        this.graphicMemory = graphicMemory;
    }

    public int getGraphicMemoryBus() {
        return graphicMemoryBus;
    }

    public void setGraphicMemoryBus(int graphicMemoryBus) {
        this.graphicMemoryBus = graphicMemoryBus;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GraphicsCard that = (GraphicsCard) o;
        return graphicMemory == that.graphicMemory && graphicMemoryBus == that.graphicMemoryBus && bandwidth == that.bandwidth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), graphicMemory, graphicMemoryBus, bandwidth);
    }
}

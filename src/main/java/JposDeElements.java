import org.jpos.*;
import java.util.HashMap;
import java.util.Map;

public class JposDeElements {

  private String DE00;
  private String DE02;
  private String DE48;

  public String getMTI() {
    return DE00;
  }

  public String getPAN() {
    return DE02;
  }

  public String getDE48() {
    return DE48;
  }

  public Map<String, String> returnDE() {
    Map<String, String> oMap = new HashMap();
    if (getMTI() != null) {
      oMap.put("00", getMTI());
    }
    if(getPAN() != null) {
      oMap.put("02", getPAN());
    }
    if(getDE48() != null) {
      oMap.put("48", getDE48);
    }
    return oMap;
  }

  public static JposDeElements.Builder builder() {
    return new JposDeElements().Builder();
  }

  private JPosDeElements (JposDeElements.Builder builder){
    this.DE00 = builder.DE00;
    this.DE02 = builder.DE02;
    this.DE48 = builder.DE48;
  }

  public static class Builder {
    private String DE00 = "0100";
    private String DE02;
    private String DE48;
  }

  public Builder() {

  }

  public JposDeElements.Builder includeMTI(String de_00) {
    this.DE00 = de_00;
    return this;
  }

  public JposDeElements.Builder includePAN(String de_02) {
    this.DE02 = de_02;
    return this;
  }

  public JposDeElements.Builder includeDE48(String de_48) {
    this.DE48 = de_48;
    return this;
  }

  public JposDeElements build() {
    return new JposDeElements(this);
  }
}

package DataObjects;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Client
{
  private String emailAddress;
  private String address;
  private String name;
}

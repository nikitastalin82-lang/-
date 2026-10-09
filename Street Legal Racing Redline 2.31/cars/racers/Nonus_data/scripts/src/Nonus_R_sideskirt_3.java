package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_sideskirt_3 extends Sideskirt
{
	public Nonus_R_sideskirt_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM right sideskirt";

		description = "A right sideskirt for the Nonus DTM. It has a special socket for direct exhaust which the DTM model has got with the new V8 engine onboard.";

		value = tHUF2USD(1643.69);
		brand_new_prestige_value = 65.11;
	}
}

package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_R_bumper extends Bumper
{
	public Kurumma_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z3 rear bumper";
		description = "Stock rear bumper for the Kurumma Z3.";

		value = tHUF2USD(161.837);
		brand_new_prestige_value = 26.99;
	}
}

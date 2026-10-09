package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ishima_models extends Chassis
{
	static int	MODEL_ENULA_WRY				= 1;
	static int	MODEL_ENULA_WRZ				= 2;
	static int	MODEL_ENULA_WR_SUPERTURIZMO	= 3;

	public Ishima_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_ISHIMA;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}

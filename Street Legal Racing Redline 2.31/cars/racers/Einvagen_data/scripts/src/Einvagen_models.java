package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_models extends Chassis
{
	static int	MODEL_110_GT		= 1;
	static int	MODEL_110_GTK		= 2;
	static int	MODEL_140_GTA		= 3;
	static int	MODEL_140_DTM		= 4;

	public Einvagen_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_EINVAGEN;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}

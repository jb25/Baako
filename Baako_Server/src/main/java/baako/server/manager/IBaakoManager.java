/**
 * 
 */
package baako.server.manager;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import baako.server.dto.GameDTO;
import baako.server.dto.PlainUserDTO;

/**
 * @author Baako-Team
 *
 */
public interface IBaakoManager extends Remote{

	/**
	 * @param username
	 * @param password
	 * @return
	 * @throws RemoteException
	 */
	public PlainUserDTO checkUserInfo(String username, String password) throws RemoteException;
	/**
	 * @param user
	 * @return
	 * @throws RemoteException
	 */
	public boolean register(PlainUserDTO user)throws RemoteException;
	/**
	 * @param g
	 * @param u
	 * @return
	 * @throws RemoteException
	 */
	public boolean buyGame(GameDTO g, PlainUserDTO u) throws RemoteException;
	/**
	 * @return
	 * @throws RemoteException
	 */
	public boolean launchGame() throws RemoteException;
	/**
	 * @param name
	 * @return
	 * @throws RemoteException
	 */
	public GameDTO searchGame(String name) throws RemoteException;
	/**
	 * @param category
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<GameDTO> searchGamebyCategory(String category) throws RemoteException;
	/**
	 * @param designer
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<GameDTO> searchGamebyDesigner(String designer) throws RemoteException;
	/**
	 * @param cardNumber
	 * @param u
	 * @return
	 * @throws RemoteException
	 */
	public boolean addWallet(int cardNumber, PlainUserDTO u) throws RemoteException;
	/**
	 * @param g
	 * @return
	 * @throws RemoteException
	 */
	public boolean addGame(GameDTO g) throws RemoteException;
	/**
	 * @return All the categories from the DB
	 * @throws RemoteException
	 */
	public ArrayList<String> getAllCategories() throws RemoteException;
	/**
	 * @return All the Designers from the DB
	 * @throws RemoteException
	 */
	public ArrayList<String> getAllDesigners() throws RemoteException;
	/*TODO: 

	public boolean addFriend(PlainUserDTO user, PlainUserDTO newFriend) throws RemoteException;

	public ArrayList<News> getAllNews() throws RemoteException;

	 */
}

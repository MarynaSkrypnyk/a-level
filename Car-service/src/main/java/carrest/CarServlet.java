package carrest;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
@WebServlet("/cars/*")
public class CarServlet extends HttpServlet {
    private final CarService carService = new CarService();
    private static final ObjectMapper mapper = new ObjectMapper();

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = req.getPathInfo();
        if (str == null) {
            resp.setContentType("application/json");
            List<Car> all = carService.getAll();
            String json = mapper.writeValueAsString(all);
            resp.getWriter().println(json);
            System.out.println(all);
        } else {
            String[] parts = str.split("/");
            String param = parts[1];
            int carId = Integer.parseInt(param);
            req.setCharacterEncoding("UTF-8");
            resp.setContentType("application/json; charset=UTF-8");
            Car car = carService.get(carId);
            String json = mapper.writeValueAsString(car);
            resp.getWriter().println(json);
            System.out.println(car);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        StringBuilder reqBody = new StringBuilder();
        try (BufferedReader reader = req.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                reqBody.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String jsonData = reqBody.toString();
        Car car = mapper.readValue(jsonData, Car.class);
        carService.save(car);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = req.getPathInfo();
        String[] parts = str.split("/");
        String param = parts[1];
        int carId = Integer.parseInt(param);
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=UTF-8");
        Car car = carService.delete(carId);
        String json = mapper.writeValueAsString(car);
        resp.getWriter().println(json);
        System.out.println(car);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = req.getPathInfo();
        String[] parts = str.split("/");
        String param = parts[1];

        int carId = Integer.parseInt(param);
        Car car = carService.get(carId);
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=UTF-8");


        String id = req.getParameter("id");
        String model = req.getParameter("model");
        String year = req.getParameter("year");

        car.setId(Integer.parseInt(id));
        car.setModel(model);
        car.setYear(Integer.parseInt(year));

        Car car1 = carService.update(car);
        String json = mapper.writeValueAsString(car1);
        resp.getWriter().println(json);
        System.out.println(car1);
    }
}

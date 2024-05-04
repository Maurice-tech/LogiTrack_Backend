LogiTrack Logistics Management Web Software

LogiTrack is a web-based logistics management software designed to streamline and optimize the delivery process for a
 logistics company This software provides customers with a user-friendly platform to create delivery orders, 
calculate costs based on weight and delivery location, make immediate payments, and receive real-time status updates. 
The logistics company can efficiently manage incoming orders, assign delivery personnel, track order statuses, and 
gain insights through a comprehensive dashboard. Below are the key features and functionalities of the LogiTrack software\
Authentication and User Management Service:

register Customeriser Registers a new customer user (TYPE CUSTOMER

createLogistics CompanyAdmin: Creates a logistics company administrator account [TYPE ADMIN]

createDelivery Personnel: Creates a new delivery personnel

account [TYPE STAFF]

verifyUser link from email on registration validates user and redirects user to login page on success(interface with FE]

login Authenticates users (customers, administrators, and delivery personnel). with their TYPE indicated in Login Response TO determine view on Frontend Login Response returns User Info on success

fetch UserDetails

change Password Simple not the crux of the matter]

Order Management Service

createDelivery Order Creates a new delivery order with details such as pickup and delivery locations(latitudes and longitudes, determined by map selections on UI) package info, and weight

calculateOrderCost Calculates the cost of a delivery order based on weight and delivery location geofence based or kmvdistance based costing)

makePayment Handles customer payments via a payment gateway (mocked Response)

update OrderDelivery Status Updates the status of a delivery order (eg. "ORDER RECEIVED ORDER PICKED." "ORDER DELIVERED"

save Order Progress Allows customers to save their order progress and continue later je g. "NEW "PENDING" "COMPLETED")

istAllOrder name as implied

fetch By Orderid

Fetch Order By Customerid

Logistics Company Service

viewthcoming Orders Rasieves incoming customer orders for logistics company administrators Only users topped in with type ADMIN can view
assignDelivery Personnel Assigns delivery personnel to specific orders. Create ASSIGNMENT SERVICE, and also make api to do manual ASSIGNMENT Basically the method takes userid[STAFF] and orderld and matches them for tracking

update OrderStatus Updates the status of delivery orders on behalf of logistics company administrators. Variant of update Order Delivery Status but for ADMINS track PaymentDetails: Tracks the amount charged and paid for each order Fetch

from Payment records by Onder Id matched to them view Dashboard Metrics. Retrieves key metrics for the admin dashboard (eg

total users total orders created [NEW], total orders fulfiled[COMPLETED)) Delivery Personnel Service (Depriontized)

viewAssigned Orders: Retrieves a list of assigned delivery orders matched to STAFF

update OrderDelivery Status: Updates the status of a delivery order (eg. "ORDER PICKED ORDER DELIVERED"

•viewOrderDefails. Retrieves comprehensive details of each assigned delivery order

Notification Service

sendOrder Notifications: Sends notifications to customers (CUSTOMER] and delivery personne [STAFF] regarding order updates

sendNewOrderAlerts: Notifies delivery personnel (STAFF) about newly assigned orders

Dashboard and Analytics Service

generate Dashboard Metrics: Generates dashboard metrics data je g. total users

total orders) for display in the admin dashboard

view Order History Retrieves the order history for logistics company administrators (similar to the AUDIT'S for an order to track its Journey

Payment Gateway Integration Service

intatePeyment Initiates the payment process with the integrated payment gateway

handle Payment CaltNOT NEEDED IF MOCKED as PAYMENT would be moved to success inmediately) Hanches callbacks from the payment gateway to condem successful paymeres

Technologies: Ngrok, Dockar, MySQL REDIS, RABBITMQ, Spring Boot 2.0+, Java 17, Google-Map API, Spring security
